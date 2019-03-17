/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutsalone9;
import javax.swing.*;
import java.awt.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
/**
 *
 * @author finito
 */
public class LayoutsAlone9 extends JFrame {
    JLabel a = new JLabel("A");
    JLabel b = new JLabel("B");
    JLabel c = new JLabel("C");
    JLabel plus = new JLabel("+");
    JLabel rownasie = new JLabel("=");
    JButton button1 = new JButton("oblicz");
    JTextField aTF = new JTextField();
    JTextField bTF = new JTextField();
    JTextField cTF = new JTextField();
    public LayoutsAlone9()
    {
        this.setBounds(7, 7, 300, 200);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents()
    {
       // a.setPreferredSize(new Dimension(400,30));
        //a.setHorizontalAlignment(SwingConstants.CENTER);
        
        b.setPreferredSize(new Dimension(200,30));
        //b.setHorizontalAlignment(JLabel.CENTER);
        c.setPreferredSize(new Dimension(200,30));
       // c.setHorizontalAlignment(JLabel.CENTER);
        
        
        aTF.setPreferredSize(new Dimension(20,10));
        bTF.setPreferredSize(new Dimension(20,10));
        cTF.setPreferredSize(new Dimension(20,10));
        
        plus.setPreferredSize(new Dimension(200,30));
        rownasie.setPreferredSize(new Dimension(200,30));
        
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup(CENTER).addComponent(a).addComponent(aTF,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(plus)
                )
                .addGroup(
                        layout.createParallelGroup(CENTER).addComponent(b).addComponent(bTF,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE).addComponent(rownasie).addComponent(button1)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(plus)
                )
                .addGroup(
                        layout.createParallelGroup(CENTER).addComponent(c).addComponent(cTF,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                )
        );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(a).addComponent(b).addComponent(c)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(aTF,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE).addComponent(plus).addComponent(bTF,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE).addComponent(plus).addComponent(cTF,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(rownasie)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(button1)
                )
                
        );
        
    }
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LayoutsAlone9().setVisible(true);
    }
    
}
