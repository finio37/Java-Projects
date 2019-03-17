/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionlayout2;
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
public class FunctionLayout2 extends JFrame{
    
    
    JLabel ylabel = new JLabel("Y");
    JLabel equalslabel = new JLabel("=");
    JLabel xlabel = new JLabel("X");
    JLabel trdpowerlabel = new JLabel("3");
    JLabel minuslabel = new JLabel("-");
    JLabel alabel = new JLabel("A");
    
    JTextField atxt = new JTextField("3");
    JButton drawBtn = new JButton("DRAW");
    JButton resetBtn = new JButton("RESET");
    public int[] x = new int[82];
    public int[] y = new int[82];
    public int a;
    public int xx=-40;
    public FunctionLayout2()
    {
        this.setBounds(5, 5, 500, 150);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        FunApp2 fapp2 = new FunApp2("Hiperbol Function Drawing");
        fapp2.setBounds(50, 50, 300, 270);
        RefineryUtilities.centerFrameOnScreen(fapp2);
        fapp2.setVisible(true);
        Font font = ylabel.getFont();
        
        ylabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        equalslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        alabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        xlabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        trdpowerlabel.setFont(new Font(font.getName(),Font.PLAIN,20));
        drawBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
        resetBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
        
       atxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        
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
                        layout.createParallelGroup().addComponent(xlabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(trdpowerlabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(drawBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(resetBtn)
                )
                
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(alabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(ylabel).addComponent(equalslabel).addComponent(atxt).addComponent(xlabel).addComponent(trdpowerlabel).addComponent(drawBtn).addComponent(resetBtn)
                )
        );
    }
    public class FunApp2 extends ApplicationFrame
    {
        public FunApp2(String str)
        {
            super(str);
            XYSeries xyseries = new XYSeries("x data");
            drawBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i =0;i<80;i++)
                    {
                        a = Integer.parseInt(atxt.getText());
                        x[i]=xx;
                        int x3 = x[i]*x[i]*x[i];
                        y[i] = a*x3;
                        xyseries.add(x[i],y[i]);
                        xx = x[i];
                        xx++;
                        x[i]=xx;
                        
                    }
                }
            
            
            });
            final XYSeriesCollection data = new XYSeriesCollection(xyseries);
            JFreeChart chart = ChartFactory.createXYLineChart("XY Hiperbol Demo", "X", "Y", data, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel chp = new ChartPanel(chart);
            chp.setPreferredSize(new java.awt.Dimension(500,300));
            setContentPane(chp);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FunctionLayout2().setVisible(true);
    }
    
}
