/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionlayout3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author finito
 */
public class FunctionLayout3 extends JFrame{
    JLabel ylabel = new JLabel("Y");
    JLabel equalslabel = new JLabel("=");
    JLabel alabel = new JLabel("A");
    JLabel hline = new JLabel("-");
    JLabel oneup = new JLabel("1");
    JLabel xlabel = new JLabel("X");
    
    JTextField atxt = new JTextField("3");
    JButton drawBtn = new JButton("DRAW");
    JButton resetBtn = new JButton("RESET");
   //public double[] x = new double[600];
   //public double[] y = new double[600];
    public double yy,xd;
    public double a;
    public double xx=-40;
    public double divresult;
    public double krok = 0.001;
    
    public FunctionLayout3()
    {
        this.setBounds(5, 5, 500, 250);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        /*GroupLayout layoutBtns = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layoutBtns);*/
        FunApp3 fapp3 = new FunApp3("Fun 1/x");
        fapp3.setBounds(50, 50, 300, 270);
        RefineryUtilities.centerFrameOnScreen(fapp3);
        fapp3.setVisible(true);
        Font font = ylabel.getFont();
        ylabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        alabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        equalslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        hline.setFont(new Font(font.getName(),Font.PLAIN,30));
        oneup.setFont(new Font(font.getName(),Font.PLAIN,30));
        xlabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        
        drawBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
        resetBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
        //https://github.com/ngadde/playground/blob/master/com.iis.sample1/src/main/java/demo/XYSplineRendererDemo1.java
        
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(ylabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(equalslabel)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(alabel).addComponent(atxt)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(oneup).addComponent(hline).addComponent(xlabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(drawBtn).addComponent(resetBtn)
                )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(alabel).addComponent(oneup).addComponent(drawBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(ylabel).addComponent(equalslabel).addComponent(atxt).addComponent(hline)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(xlabel).addComponent(resetBtn)
                )
                
        );
        
        /*layoutBtns.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layoutBtns.createParallelGroup().addComponent(drawBtn).addComponent(resetBtn)
                )
                
        );
        layoutBtns.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layoutBtns.createParallelGroup().addComponent(drawBtn)
                )
                .addGroup(
                        layoutBtns.createParallelGroup().addComponent(resetBtn)
                )
                
        );*/
        
    }
    public class FunApp3 extends ApplicationFrame
    {
        public FunApp3(String str)
        {
            super(str);
            //x[0]=-40;
            XYSeries xyseries = new XYSeries(str);
            drawBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    
                    //for (int i=0;i<148;i++)
                    while(xx<40)
                    {
                        a = Double.parseDouble(atxt.getText());
                        //if (xx==0) ++xx;
                        divresult = Math.pow(xx, -1);
                        yy =a*divresult;
                        xyseries.add(xx, yy);
                        xx++;
                    }
                }
            
            });
            XYSeriesCollection data = new XYSeriesCollection(xyseries);
            JFreeChart chart = ChartFactory.createXYLineChart("1/x", "X", "Y", data, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel chp = new ChartPanel(chart);
            chp.setPreferredSize(new java.awt.Dimension(300,300));
            setContentPane(chp);
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FunctionLayout3().setVisible(true);
    }
    
}
