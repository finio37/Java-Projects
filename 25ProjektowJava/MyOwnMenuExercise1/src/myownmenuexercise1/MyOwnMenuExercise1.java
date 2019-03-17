/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownmenuexercise1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.control.MenuButton;
/**
 *
 * @author finito
 */
public class MyOwnMenuExercise1 extends JFrame {

    private Container container = this.getContentPane();
    private JPanel jpanelMenu = new JPanel();
    private MenuButton mb1 = new MenuButton("First option");
    private MenuButton mb2 = new MenuButton("Second option");
    private MenuButton mb3 = new MenuButton("Third option");
    
    public MyOwnMenuExercise1()
    {
        this.setBounds(10, 10, 300, 300);
        this.initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void initComponents()
    {
        this.container.add(this.jpanelMenu);
        this.jpanelMenu.setLayout(new GridLayout(3,1));
        
        this.jpanelMenu.add(this.mb1);
        this.jpanelMenu.add(this.mb2);
        this.jpanelMenu.add(this.mb3);
        
    }
    private class MenuButton extends JButton
    {
        public MenuButton(String nazwa)
        {
            super(nazwa);
            
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MyOwnMenuExercise1().setVisible(true);
    }
    
}
