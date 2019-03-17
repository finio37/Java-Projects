/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutsalone1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author finito
 */
public class LayoutsAlone1 extends JFrame {
   
    
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel panelMainGeneral = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    JPanel panelR3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");
    JButton button3 = new JButton("button3");
    JButton button4 = new JButton("button4");
    JButton button5 = new JButton("button5");
    
    JButton buttonR3a = new JButton("buttonR3a");
    JButton buttonR3b = new JButton("buttonR3b");
    JButton buttonR3c = new JButton("buttonR3c");
    
    
    JButton button5a = new JButton("button5a");
    JButton button5b = new JButton("button5b");
    JButton button5c = new JButton("button5c");
    
    
    JButton button6 = new JButton("button6");
    JButton button7 = new JButton("button7");
    JButton button8 = new JButton("button8");
    public LayoutsAlone1()
    {
        this.setBounds(400, 400, 400, 300);
        initComponents();
        this.setDefaultCloseOperation(3);
    }
    public void initComponents()
    {
        
        panel1.add(button1,BorderLayout.NORTH);
        panel1.add(button2,BorderLayout.CENTER);
        panel1.add(button3,BorderLayout.SOUTH);
        add(panel1,BorderLayout.NORTH);
        
        panel2.add(button4,BorderLayout.NORTH);
        panel2.add(button5,BorderLayout.CENTER);
        add(panel2,BorderLayout.CENTER);
        
        panelR3.add(buttonR3a,BorderLayout.NORTH);
        panelR3.add(buttonR3b,BorderLayout.CENTER);
        panelR3.add(buttonR3c,BorderLayout.SOUTH);
        panel3.add(panelR3,BorderLayout.CENTER);
        
        
        panel3.add(button5a,BorderLayout.NORTH);
        panel3.add(button5b,BorderLayout.CENTER);
        panel3.add(button5c,BorderLayout.SOUTH);
        //add(panel3,BorderLayout.CENTER);
        panel4.add(panel3,BorderLayout.CENTER);
        panel4.add(button6,BorderLayout.NORTH);
        panel4.add(button7,BorderLayout.CENTER);
        panel4.add(button8,BorderLayout.SOUTH);
        
        add(panel4,BorderLayout.SOUTH);
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LayoutsAlone1().setVisible(true);
    }
    
}
