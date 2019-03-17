/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutsalone7;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author finito
 */
public class LayoutsAlone7 extends JFrame {
    JButton b1 = new JButton("button1");
    JButton b2 = new JButton("button2");
    JButton b3 = new JButton("button3");
    
    JButton b4 = new JButton("button4");
    JButton b5 = new JButton("button5");
    JButton b6 = new JButton("button6");
    
    JButton b7 = new JButton("button7");
    JButton b8 = new JButton("button8");
    JButton b9 = new JButton("button9");
    
    JButton b10 = new JButton("button10");
    JButton b11 = new JButton("button11");
    JButton b12 = new JButton("button12");
    
    JButton b13 = new JButton("button13");
    JButton b14 = new JButton("button14");
    JButton b15 = new JButton("button15");
    
    JButton b16 = new JButton("button16");
    JButton b17 = new JButton("button17");
    JButton b18 = new JButton("button18");
    
    JButton b19 = new JButton("button19");
    JButton b20 = new JButton("button20");
    JButton b21 = new JButton("button21");
    
    JButton b22 = new JButton("button22");
    JButton b23 = new JButton("button23");
    JButton b24 = new JButton("button24");
    
    JButton b25 = new JButton("button25");
    JButton b26 = new JButton("button26");
    JButton b27 = new JButton("button27");
    
    JButton b28 = new JButton("button28");
    JButton b29 = new JButton("button29");
    JButton b30 = new JButton("button30");
    
    JButton b31 = new JButton("button31");
    JButton b32 = new JButton("button32");
    JButton b33 = new JButton("button33");
    
    JButton b44 = new JButton("button44");
    JButton b45 = new JButton("button45");
    JButton b46 = new JButton("button46");
    
    JButton b47 = new JButton("button47");
    JButton b48 = new JButton("button48");
    JButton b49 = new JButton("button49");
    public LayoutsAlone7()
    {
        this.setBounds(10, 10, 1200, 800);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(b6).addComponent(b24)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b7).addComponent(b25)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b16)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b1).addComponent(b17)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b28)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b3).addComponent(b11).addComponent(b19).addComponent(b29)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b21).addComponent(b30)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b12)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b47).addComponent(b48).addComponent(b49)
                )                        
                .addGroup(
                        layout.createParallelGroup().addComponent(b5).addComponent(b32)
                )
        );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(b2).addComponent(b1).addComponent(b3).addComponent(b5)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b6).addComponent(b7).addComponent(b11).addComponent(b12).addComponent(b47)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b16).addComponent(b17).addComponent(b19).addComponent(b21).addComponent(b48)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b24).addComponent(b25).addComponent(b28).addComponent(b29).addComponent(b30).addComponent(b49).addComponent(b32)
                )
                
        );
        
        
    }
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LayoutsAlone7().setVisible(true);
        
    }
    
}
