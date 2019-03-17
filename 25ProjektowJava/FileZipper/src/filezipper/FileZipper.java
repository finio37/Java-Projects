/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filezipper;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.nio.file.Files;
import javax.swing.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 *
 * @author finito
 */
public class FileZipper extends JFrame {
    
    
    
    private JButton addBtn;
    private JButton removeBtn;
    private JButton zipBtn;
    private JMenuBar jmenuBlt = new JMenuBar();
    public static final int BUFFOR = 1024;
    private ArrayList listOfPaths = new ArrayList();
    private DefaultListModel listModel = new DefaultListModel()
    {
        public void addElement(Object obj)
        {
            arlist.add(obj);
            super.addElement(((File)obj).getName());
        }
        public Object get(int index)
        {
            return arlist.get(index);
        }
        public Object remove(int index)
        {
            arlist.remove(index);
            return super.remove(index);
        }
        ArrayList arlist = new ArrayList();
    };
    private JList list = new JList(this.listModel);
    private JFileChooser chooser = new JFileChooser();
    
    public FileZipper()
    {
        this.setTitle("Zipper");
        this.setBounds(5, 5, 250, 250);
        this.setJMenuBar(jmenuBlt);
        JMenu menuFile = this.jmenuBlt.add(new JMenu("File"));
        
        Action addAction = new MyOwnAction("Add","Add new element to archive","ctrl A", new ImageIcon("dodaj.png"));
        Action removeAction = new MyOwnAction("Remove","Remove element from archive","ctrl R",new ImageIcon("usun.png"));
        Action zipAction = new MyOwnAction("Zip","Zippuj","ctrl Z");
        this.addBtn = new JButton(addAction);
        this.removeBtn = new JButton(removeAction);
        this.zipBtn = new JButton(zipAction);
        
        JMenuItem openMenu = menuFile.add(addAction);
        JMenuItem removeMenu = menuFile.add(removeAction);
        JMenuItem zipMenu = menuFile.add(zipAction);
        JScrollPane scroll = new JScrollPane(list);
        list.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addComponent(list,100,150,Short.MAX_VALUE)
                .addContainerGap(0,Short.MAX_VALUE)
                .addGroup(
                        layout.createParallelGroup()
                        .addComponent(addBtn)
                        .addComponent(removeBtn)
                        .addComponent(zipBtn)
                )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                .addComponent(list,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                .addGroup(
                        layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addComponent(removeBtn)
                        .addContainerGap(0,Short.MAX_VALUE)
                        .addComponent(zipBtn)
                )
        );
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    
    private class MyOwnAction extends AbstractAction
    {
        public MyOwnAction(String name,String description,String keyShortValue)
        {
            this.putValue(Action.NAME, name);
            this.putValue(Action.SHORT_DESCRIPTION, description);
            this.putValue(Action.ACCELERATOR_KEY,KeyStroke.getKeyStroke(keyShortValue));
        }
        public MyOwnAction(String name,String description,String keyShortValue,Icon icon)
        {
            this(name,description,keyShortValue);
            this.putValue(Action.SMALL_ICON,icon);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add"))
                //System.out.println("Adding");
                addElementsToArchive();
            else if (e.getActionCommand().equals("Remove"))
                removeElementsFromArchive();
                
            else if (e.getActionCommand().equals("Zip"))
                createZip();
        }
        private void addElementsToArchive()
        {
            chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            chooser.setMultiSelectionEnabled(true);
            int tmp = chooser.showDialog(rootPane, "Add element to archive");
            if (tmp==JFileChooser.APPROVE_OPTION)
            {
                File[] paths =  chooser.getSelectedFiles();
                for (int i=0;i<paths.length;i++)
                {
                    if (!isElementRepetive(paths[i].getPath()))
                    listModel.addElement(paths[i]);
                }
            }
        }
        private void removeElementsFromArchive()
        {
            int[] temp =  list.getSelectedIndices();
            for (int i=0;i<temp.length;i++)
            {
                listModel.remove(temp[i]-i);
            }
        }
        private boolean isElementRepetive(String testedElement)
        {
            for (int i=0;i<listModel.getSize();i++)
            {
                if (((File)listModel.get(i)).getPath().equals(testedElement))
                    return true;
                
                
            }
            return false;
        }
        private void createZip()
        {
            chooser.setCurrentDirectory(new File("user.dir"));
            chooser.setSelectedFile(new File(System.getProperty("user.dir")+File.separator+"mojanazwa.zip"));
            int tmp = chooser.showDialog(rootPane, "Zip!");
            if (tmp==JFileChooser.APPROVE_OPTION)
            {
                
                byte tmpData[] = new byte[BUFFOR];
                try
                {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(chooser.getSelectedFile())));
                    //zipOutputStream.putNextEntry(e);
                    for (int i=0;i<listModel.getSize();i++)
                    {
                        if (!((File)listModel.get(i)).isDirectory())
                            doZip(zipOutputStream,(File)listModel.get(i),tmpData,((File)listModel.get(i)).getPath());
                            
                        else
                        {
                            printPaths((File)listModel.get(i));
                            for (int j=0;j<listOfPaths.size();j++)
                            doZip(zipOutputStream,(File)listModel.get(j),tmpData,((File)listModel.get(j)).getPath());
                            listOfPaths.removeAll(listOfPaths);
                        }
                    }
                    zipOutputStream.close();
                }
                
                catch(IOException e)
                {
                    e.getMessage();
                }
            }
            
        }
        private void doZip(ZipOutputStream zipOutputStream,File filePath,byte[] tempData,String basePath) throws IOException
        {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath),BUFFOR);
            zipOutputStream.putNextEntry(new ZipEntry(filePath.getPath().substring(basePath.lastIndexOf(File.separator)+1)));
            int counter;
            while((counter=bufferedInputStream.read(tempData,0,BUFFOR))!=-1)
                zipOutputStream.write(tempData,0,counter);
            zipOutputStream.closeEntry();
            bufferedInputStream.close();
            
        }
        private void printPaths(File pathName)
        {
            String[] nameOfFilesAndCatalogs = pathName.list();
            for (int i=0;i<nameOfFilesAndCatalogs.length;i++)
            {
                File p = new File(pathName.getPath(),nameOfFilesAndCatalogs[i]);
                if (p.isFile())
                    listOfPaths.add(p);
                if (p.isDirectory())
                    printPaths(new File(p.getPath()));
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FileZipper().setVisible(true);
    }
    
}
