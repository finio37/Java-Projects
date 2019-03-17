/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionlayout1;
import javax.swing.*;
import java.awt.*;
//import java.awt.Graphics;
//import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
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
public class FunctionLayout1 extends JFrame {
    JLabel ylabel = new JLabel("Y");
    JLabel equalslabel = new JLabel("=");
    JLabel multiplelabel = new JLabel("*");
    JLabel alabel = new JLabel("A");
    JLabel blabel = new JLabel("B");
    JLabel xlabel = new JLabel("X");
    JLabel minuslabel = new JLabel("-");
    
    JTextField jatext  = new JTextField("3");
    JTextField jbtext = new JTextField("4");
    
    JButton drawBtn = new JButton("DRAW FUNCTION");
    JButton resetBtn = new JButton("RESET FUNCTION");
    
    public int[] x = new int[82];
    public int[] y = new int[82];
    public int a,b;
    public int xx=-40;
public FunctionLayout1()
{
    this.setBounds(7, 7, 700, 240);
    initComponents();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
}
public class FunApp extends ApplicationFrame{
    
    public FunApp(String str)
    {
        super(str);
        XYSeries series = new XYSeries("Random Data");
        drawBtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i=0;i<80;i++)
            {
                a = Integer.parseInt(jatext.getText());
                b = Integer.parseInt(jatext.getText());
                x[i]= xx;
                
                y[i]=a*x[i]+b;
                series.add(x[i],y[i]);
                    xx++;
                    x[i]=xx;
                
            }
        }
    });
    
    final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "XY Series Demo",
            "X", 
            "Y", 
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(300, 270));
        setContentPane(chartPanel);
        
    
    }
}

/*public void paint(Graphics g) {
    super.paint(g);
    g.drawLine(0,0,100,100);
    g.drawLine(10, 10, 20, 300);
    // more drawing code here...
}*/
public void initComponents()
{
    GroupLayout layout = new GroupLayout(this.getContentPane());
    this.getContentPane().setLayout(layout);
    FunApp fa = new FunApp("Linear Function Drawing");
    fa.setBounds(50,50, 500, 500);
    RefineryUtilities.centerFrameOnScreen(fa);
    fa.setVisible(true);
    Font font = ylabel.getFont();
    alabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    blabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    xlabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    ylabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    equalslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    multiplelabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    minuslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
    
    
    jatext.setFont(new Font(font.getName(),Font.PLAIN,30));
    jbtext.setFont(new Font(font.getName(),Font.PLAIN,30));
    
    drawBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
    resetBtn.setFont(new Font(font.getName(),Font.PLAIN,30));
    
    
    
    layout.setHorizontalGroup(
            layout.createSequentialGroup()
            .addGroup(
                    layout.createParallelGroup().addComponent(ylabel)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(equalslabel)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(alabel).addComponent(jatext)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(multiplelabel)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(xlabel)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(minuslabel)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(blabel).addComponent(jbtext)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(drawBtn).addComponent(resetBtn)
            )
    );
    
    layout.setVerticalGroup(
            layout.createSequentialGroup()
            .addGroup(
                    layout.createParallelGroup().addComponent(alabel).addComponent(blabel).addComponent(drawBtn)
            )
            .addGroup(
                    layout.createParallelGroup().addComponent(ylabel).addComponent(equalslabel).addComponent(jatext).addComponent(multiplelabel).addComponent(xlabel).addComponent(minuslabel).addComponent(jbtext).addComponent(resetBtn)
            )
    );
    
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FunctionLayout1().setVisible(true);
    }
    
}
