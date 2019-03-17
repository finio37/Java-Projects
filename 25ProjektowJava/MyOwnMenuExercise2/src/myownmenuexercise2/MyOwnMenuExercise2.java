/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownmenuexercise2;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author finito
 */
public class MyOwnMenuExercise2 extends JFrame{
    private JMenuBar jmenubar = new JMenuBar();
    private JMenu jmenuFile = new JMenu("File");
    private JMenu jmenuEdit = new JMenu("Edit");
    private JMenu jmenuOption = new JMenu("Option");
    
    
    
    
    
    
    public MyOwnMenuExercise2()
    {
        this.setBounds(5, 5, 300, 300);
        this.initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(jmenubar);
    }
    public void initComponents()
    {
        this.jmenubar.add(this.jmenuFile);
        
        this.jmenubar.add(this.jmenuEdit);
        this.jmenubar.add(this.jmenuOption);
        
        JMenuItem jsubmenuFile = jmenuFile.add(new JMenuItem("Save"));
        this.jmenuFile.add(new JMenuItem("Open"));
        this.jmenuFile.add(new JMenuItem("Read"));
        JMenu jmenuSaveOption = new JMenu("Save Option");
      
        this.jmenuFile.add(jmenuSaveOption);
        
        jmenuSaveOption.add(new JMenuItem("Save Pdf"));
        jmenuSaveOption.add(new JMenuItem("Save Doc"));
        jmenuSaveOption.add(new JMenuItem("Save Mp3"));
        
        JMenu jsubmenuOpen = new JMenu("Open Option");
        this.jmenuFile.add(jsubmenuOpen);
        jsubmenuOpen.add(new JMenuItem("Open 1"));
        jsubmenuOpen.add(new JMenuItem("Open 2"));
        jsubmenuOpen.add(new JMenuItem("Open 3"));
        
        JMenu jmenuEditOption = new JMenu("Edit Options");
        this.jmenuEdit.add(jmenuEditOption);
        jmenuEditOption.add(new JMenuItem("Edit Option 1"));
        jmenuEditOption.add(new JMenuItem("Edit Option 2"));
        jmenuEditOption.add(new JMenuItem("Edit Option 3"));
        
        
        
       
        
        
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MyOwnMenuExercise2().setVisible(true);
        
    }
    
}
