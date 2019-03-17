/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionlayout6;
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
public class FunctionLayout6 extends JFrame{

    JLabel ylabel = new JLabel("Y");
    JLabel equalslabel = new JLabel("=");
    JLabel alabel = new JLabel("A");
    JLabel blabel = new JLabel("B");
    JLabel vlinelabel = new JLabel("|");
    JLabel vslinelabel = new JLabel("|");
    JLabel vsslinelabel = new JLabel("|");
    JLabel xlabel = new JLabel("X");
    JLabel xslabel = new JLabel("X");
    JLabel pluslabel = new JLabel("+");
    JLabel plusslabel = new JLabel("+");
    JLabel inclabel = new JLabel("=> X <= 0");
    JLabel incslabel = new JLabel("=> X > 0");
    
    JTextField atxt = new JTextField("3");
    JTextField btxt = new JTextField("4");
    JTextField astxt = new JTextField("5");
    JTextField bstxt = new JTextField("6");
    
    JButton drawBtn = new JButton("DRAW");
    JButton resetBtn = new JButton("RESET");
    public double xxup = -40;
    public double xxdown = 1;
    public double yyup,yydown;
    public double aup, bup, adown,bdown;
    public double mresultup,mresultdown;
    public double addresultup,addresultdown;
    public double resultup,resultdown;
    
    
    
    public FunctionLayout6()
    {
        this.setBounds(5, 5, 800, 200);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        FunApp6 fapp6 = new FunApp6("complex linear function");
        fapp6.setBounds(50, 50, 300, 300);
        RefineryUtilities.centerFrameOnScreen(fapp6);
        fapp6.setVisible(true);
        Font font = ylabel.getFont();
        ylabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        equalslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        vlinelabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        vslinelabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        vsslinelabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        alabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        atxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        astxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        xlabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        xslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        pluslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        plusslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        blabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        btxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        bstxt.setFont(new Font(font.getName(),Font.PLAIN,30));
        inclabel.setFont(new Font(font.getName(),Font.PLAIN,30));
        incslabel.setFont(new Font(font.getName(),Font.PLAIN,30));
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
                        layout.createParallelGroup().addComponent(vlinelabel).addComponent(vslinelabel).addComponent(vsslinelabel)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(alabel).addComponent(atxt).addComponent(astxt)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(xlabel).addComponent(xslabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(pluslabel).addComponent(plusslabel)
                )
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(blabel).addComponent(btxt).addComponent(bstxt)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(inclabel).addComponent(incslabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(drawBtn).addComponent(resetBtn)
                )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(alabel).addComponent(blabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(vlinelabel).addComponent(atxt).addComponent(xlabel).addComponent(pluslabel).addComponent(btxt).addComponent(inclabel).addComponent(drawBtn)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(ylabel).addComponent(equalslabel).addComponent(vslinelabel)
                )
                .addGroup(
                        layout.createParallelGroup().addComponent(vsslinelabel).addComponent(astxt).addComponent(xslabel).addComponent(plusslabel).addComponent(bstxt).addComponent(incslabel).addComponent(resetBtn)
                )
        );
    }
    public class FunApp6 extends ApplicationFrame
    {
        public FunApp6(String str)
        {
            super(str);
            XYSeries xyseries = new XYSeries(str);
            drawBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    while(xxup>=-40 && xxup<=0)
                    {
                        aup = Double.parseDouble(atxt.getText());
                        bup = Double.parseDouble(btxt.getText());
                        mresultup=aup*xxup;
                        resultup=addresultup = mresultup+bup;
                        yyup = resultup;
                        xyseries.add(xxup,yyup);
                        xxup++;
                    }
                    while(xxdown>0 && xxdown<=40)
                    {
                        adown = Double.parseDouble(astxt.getText());
                        bdown = Double.parseDouble(bstxt.getText());
                        mresultdown = adown*xxdown;
                        resultdown=addresultup=mresultdown+bdown;
                        yydown = resultdown;
                        xyseries.add(xxdown,yydown);
                        xxdown++;
                    }
                    xxup=-40;
                    xxdown = 0.1;
                }
            
            });
            resetBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    xyseries.clear();
                }
                
            });
            XYSeriesCollection data = new XYSeriesCollection(xyseries);
            JFreeChart chart = ChartFactory.createXYLineChart("complex line function", "X", "Y", data, PlotOrientation.VERTICAL, true, true, false);
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
        new FunctionLayout6().setVisible(true);
    }
    
}
