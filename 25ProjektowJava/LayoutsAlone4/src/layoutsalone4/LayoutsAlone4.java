/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutsalone4;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author finito
 */
public class LayoutsAlone4 extends JFrame {
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
    public LayoutsAlone4()
    {
        this.setBounds(600, 600, 600, 500);
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
                        layout.createParallelGroup().addComponent(b1).addComponent(b4).addComponent(b7).addComponent(b10).addComponent(b13)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b2).addComponent(b14)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b3).addComponent(b6).addComponent(b9).addComponent(b12).addComponent(b15)
                )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(b1).addComponent(b2).addComponent(b3)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b4).addComponent(b6)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b7).addComponent(b9)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b10).addComponent(b12)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(b13).addComponent(b14).addComponent(b15)
                )
                
        );
    }
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LayoutsAlone4().setVisible(true);
        
    }
    
}
