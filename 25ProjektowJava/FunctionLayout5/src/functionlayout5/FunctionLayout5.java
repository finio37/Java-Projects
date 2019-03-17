/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionlayout5;
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
public class FunctionLayout5 extends JFrame {
    
    JLabel ylabel = new JLabel("Y");
    JLabel equalslabel = new JLabel("=");
    JLabel alabel = new JLabel("A");
    JLabel xlabel = new JLabel("X");
    JLabel xslabel = new JLabel("X");
    JLabel twolabel = new JLabel("2");
    JLabel pluslabel = new JLabel("+");
    JLabel plusslabel = new JLabel("+");
    JLabel blabel = new JLabel("B");
    JLabel clabel = new JLabel("C");
    
    JTextField atxt = new JTextField("3");
    JTextField btxt = new JTextField("5");
    JTextField ctxt = new JTextField("4");
    
    JButton drawBtn = new JButton("DRAW");
    JButton resetBtn = new JButton("RESET");
    public double a,b,c;
    public double xx=-40;
    public double yy;
    public double powresult;
    public double mresult,msresult;
    public double addresult,addsresult,yresult;
    
    public FunctionLayout5()
    {
        this.setBounds(5,5,700,150);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        
        Font font = ylabel.getFont();
        FunApp5 fapp5 = new FunApp5("x2+x+hmm");
        fapp5.setBounds(50, 50, 300, 300);
        RefineryUtilities.centerFrameOnScreen(fapp5);
        fapp5.setVisible(true);
        ylabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        equalslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        alabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        xlabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        twolabel.setFont(new Font(font.getName(),Font.PLAIN,10));
        pluslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        blabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        xslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        clabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        plusslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        
        atxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        btxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        ctxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        
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
                        layout.createParallelGroup().addComponent(xlabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(twolabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(pluslabel)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(blabel).addComponent(btxt)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(xslabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(plusslabel)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(clabel).addComponent(ctxt)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(drawBtn).addComponent(resetBtn)
                )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(alabel).addComponent(blabel).addComponent(clabel).addComponent(drawBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(ylabel).addComponent(equalslabel).addComponent(atxt).addComponent(xlabel).addComponent(twolabel).addComponent(pluslabel).addComponent(btxt).addComponent(xslabel).addComponent(plusslabel).addComponent(ctxt).addComponent(resetBtn)
                )
        );
    }
    public class FunApp5 extends ApplicationFrame
    {
        public FunApp5(String str)
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
                        c = Double.parseDouble(ctxt.getText());
                        powresult = Math.pow(xx, 2);
                        mresult = a*powresult;
                        msresult = b*xx;
                        addresult = mresult+msresult;
                        yresult=addsresult = addresult+c;
                        yy = yresult;
                        xyseries.add(xx,yy);
                        xx++;
                    }
                    xx=-40;
                }
                
            });
            resetBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    xyseries.clear();
                }
                
            });
            
            XYSeriesCollection data = new XYSeriesCollection(xyseries);
            JFreeChart chart = ChartFactory.createXYLineChart("x2+x+hmm", "X", "Y", data, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel chp = new ChartPanel(chart);
            chp.setPreferredSize(new java.awt.Dimension(300,270));
            setContentPane(chp);
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FunctionLayout5().setVisible(true);
    }
    
}
