/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleCalculator;

/**
 *
 * @author finito
 */
public class DoCalculations implements Calculate {
    private int a;
    private int b;
    private int c;
    private double ad;
    private double bd;
    private double d;
    private double fel,sel;
    private double p,q;
    private double xw,yw;
    private int lx,rx;
    private double res1,res2;
    public int getLx()
    {
        return lx;
    }
    
    public void setLx(int lx)
    {
        this.lx = lx;
    }
    public int getRx()
    {
        return rx;
    }
    public double getRes1()
    {
        return res1;
    }
    public double getRes2()
    {
        return res2;
    }
    public void setRes1(double res1)
    {
        this.res1 = res1;
    }
    public void setRes2(double res2)
    {
        this.res2 = res2;
    }
    public void setRx(int rx)
    {
        this.rx = rx;
    }
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int getC()
    {
        return c;
    }
    public double getP()
    {
        return p;
    }
    public double getQ()
    {
        return q;
    }
    public void setFel(double fel)
    {
        this.fel = fel;
    }
    public void setSel(double sel)
    {
        this.sel = sel;
    }
    public void setP(double p)
    {
        this.p = p;
    }
    public void setQ(double q)
    {
        this.q = q;
    }
    
    public double getFel()
    {
        return fel;
    }
    public double getSel()
    {
        return sel;
    }
    public double getXw()
    {
        return xw;
    }
    public double getYw()
    {
        return yw;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public void setB(int b)
    {
        this.b = b;
    }
    public void setC(int c)
    {
        this.c = c;
    }
    public void setAd(double ad)
    {
        this.ad = ad;
    }
    public void setBd(double bd)
    {
        this.bd = bd;
    }
    public void setD(double d)
    {
        this.d = d;
    }
    public void setXw(double xw)
    {
        this.xw = xw;
    }
    public void setYw(double yw)
    {
        this.yw = yw;
    }
    public double getAd()
    {
        return ad;
    }
    public double getBd()
    {
        return bd;
    }
    public double getD()
    {
        return d;
    }
    public int addIntegerNumbers(int a,int b)
    {
        return a+b;
    }
    public double addDoubleNumbers(double ad,double bd)
    {
        return ad+bd;
    }
    public int multiplyIntegerNumbers(int a,int b)
    {
        return a*b;
    }
    public double multiplyDoubleNumbers(double ad,double bd)
    {
        return ad*bd;
    }
    public int subtractIntegerNumbers(int a, int b)
    {
        return a-b;
    }
    public double subtractDoubleNumbers(double ad,double bd)
    {
        return ad-bd;
    }
    public int divideIntegerNumbers(int a,int b)
    {
        return a/b;
    }
    public double divideDoubleNumbers(double ad,double bd)
    {
        return ad/bd;
    }
    public double doSecondPower(double p)
    {
        return p*p;
    }
    /*public double firstElementValue(int b,double d,int a)
    {
        double fel = (-b-Math.sqrt(d))/2*a;
        return fel;
    }
    public double secondElementValue(int b,double d,int a)
    {
        double sel = (-b-Math.sqrt(d)/2*a);
        return sel;
    }*/
    /*public double delta(DoCalculations dc,double b,double a,double c)
    {
        
    }*/
    /*public double delta(DoCalculations dc, double b, double a, double c) {
        
        double d = dc.doSecondPower(b)-

    }*/

    
    
    
    
}
