/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionlayout4;
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
public class FunctionLayout4 extends JFrame{
    JLabel ylabel = new JLabel("Y");
    JLabel equalslabel = new JLabel("=");
    JLabel alabel = new JLabel("A");
    JLabel blabel = new JLabel("B");
    JLabel hlinelabel = new JLabel("---");
    JLabel pluslabel = new JLabel("+");
    JLabel onelabel = new JLabel("1");
    JLabel xlabel = new JLabel("X");
    
    JTextField atxt = new JTextField("3");
    JTextField btxt = new JTextField("5");
    
    JButton drawBtn = new JButton("DRAW");
    JButton resetBtn = new JButton("RESET");
    
    public int xx=-40;
    public double a,b;
    public double yy;
    public double divresult;
    public double mresult;
    public double addresult;
    public FunctionLayout4()
    {
        this.setBounds(5, 5, 500, 180);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        FunApp4 fapp4 = new FunApp4("1/x");
        fapp4.setBounds(50, 50, 300, 300);
        RefineryUtilities.centerFrameOnScreen(fapp4);
        fapp4.setVisible(true);
        Font font = ylabel.getFont();
        ylabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        equalslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        alabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        onelabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        hlinelabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        xlabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        pluslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        blabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        
        atxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        btxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        
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
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(alabel).addComponent(atxt)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(onelabel).addComponent(hlinelabel).addComponent(xlabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(pluslabel)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(blabel).addComponent(btxt)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(drawBtn).addComponent(resetBtn)
                )
                //
                
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(alabel).addComponent(onelabel).addComponent(blabel).addComponent(drawBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(ylabel).addComponent(equalslabel).addComponent(atxt).addComponent(hlinelabel).addComponent(pluslabel).addComponent(btxt).addComponent(resetBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(xlabel)
                )
                
        );
        
    }
    public class FunApp4 extends ApplicationFrame
    {
        public FunApp4(String str)
        {
            super(str);
            XYSeries xyseries = new XYSeries(str);
            drawBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    while(xx<40)
                    {
                        a = Double.parseDouble(atxt.getText());
                        b = Double.parseDouble(btxt.getText());
                        if (xx==0) ++xx;
                        divresult= Math.pow(xx, -1);
                        mresult = a*divresult;
                        addresult = mresult+b;
                        yy=addresult;
                        xyseries.add(xx,yy);
                        xx++;
                    }
                    xx=-40;
                }
                
            });
            resetBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    xyseries.clear();
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
        new FunctionLayout4().setVisible(true);
    }
    
}
