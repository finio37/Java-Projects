/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutsalone10;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author finito
 */
public class LayoutsAlone10 extends JFrame {
    
    JLabel aLabel = new JLabel("A");
    JLabel bLabel = new JLabel("B");
    JLabel cLabel = new JLabel("C");
    JLabel xLabel = new JLabel("X");
    JLabel sxLabel = new JLabel("X");
    JLabel plusLabel1 = new JLabel("+");
    JLabel plusLabel2 = new JLabel("+");
    JLabel equalsLabel = new JLabel("=");
    
    JTextField jtexta = new JTextField();
    JTextField jtextb = new JTextField();
    JTextField jtextc = new JTextField();
    
    JButton calculateBtn = new JButton("calculate");
    JButton resetBtn = new JButton("reset");
    
    
    
    
    public LayoutsAlone10()
    {
        this.setBounds(7, 7, 800, 350);
        initComponents();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        Font font = xLabel.getFont();
        //String txtofxlabel = xLabel.getText();
        
        
        this.getContentPane().setLayout(layout);
        
        aLabel.setFont(new Font(font.getName(),Font.PLAIN,50));
        bLabel.setFont(new Font(font.getName(),Font.PLAIN,50));
        cLabel.setFont(new Font(font.getName(),Font.PLAIN,50));
        xLabel.setFont(new Font(font.getName(),Font.PLAIN,50));
        sxLabel.setFont(new Font(font.getName(),Font.PLAIN,50));
        plusLabel1.setFont(new Font(font.getName(),Font.PLAIN,50));
        plusLabel2.setFont(new Font(font.getName(),Font.PLAIN,50));
        equalsLabel.setFont(new Font(font.getName(),Font.PLAIN,50));
        
        jtexta.setFont(new Font(font.getName(),Font.PLAIN,50));
        jtextb.setFont(new Font(font.getName(),Font.PLAIN,50));
        jtextc.setFont(new Font(font.getName(),Font.PLAIN,50));
        
        calculateBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
        resetBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(aLabel).addComponent(jtexta)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(xLabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(plusLabel1)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(bLabel).addComponent(jtextb).addComponent(equalsLabel).addComponent(calculateBtn).addComponent(resetBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(sxLabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(plusLabel2)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(cLabel).addComponent(jtextc)
                )
             
                
                
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(aLabel).addComponent(bLabel).addComponent(cLabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(jtexta).addComponent(xLabel).addComponent(plusLabel1).addComponent(jtextb).addComponent(sxLabel).addComponent(plusLabel2).addComponent(jtextc)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(equalsLabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(calculateBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(resetBtn)
                )
        );
        
    }
    /*public static JLabel CreateLabel(String str)
    {
        JLabel jlabel = new JLabel(str);
        return jlabel;
    }
    public void CreateTextField()
    {
        JTextField jtext = new JTextField();
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LayoutsAlone10().setVisible(true);
    }
    
}
