/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleCalculator;

import static java.lang.System.in;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author finito
 */
public class ElementsMain {

    /**
     * @param args the command line arguments
     */
    
    public static<T> void println(T t)
    {
        System.out.println(t);
    }
    public static<T> void print(T t)
    {
        System.out.print(t);
    }
    public static double delta(DoCalculations dc,double b,double a,double c)
    {
        double bpowres = dc.doSecondPower(b);
        double ac4 = 4*dc.multiplyDoubleNumbers(a, c);
        double d = dc.subtractDoubleNumbers(bpowres, ac4);
        return d;
    }
    public static void elementsValue(DoCalculations dc,double b,double a,double d)
    {
        b=-b;
        double counterForFel = dc.subtractDoubleNumbers(b, Math.sqrt(d));
        double denominator = 2*a;
        dc.setFel(dc.divideDoubleNumbers(counterForFel, denominator));
        double counterForSel = dc.addDoubleNumbers(b,  Math.sqrt(d));
        dc.setSel(dc.divideDoubleNumbers(counterForSel, denominator));
    }
    public static void elementsValue(DoCalculations dc,double b,double a)
    {
        b=-b;
        double counter = b;
        double denominator = 2*a;
        dc.setFel(dc.divideDoubleNumbers(counter, denominator));
    }
    public static void pqValue(DoCalculations dc,double b,double a,double d)
    {
        b = -b;
        double p = dc.divideDoubleNumbers(b, dc.multiplyDoubleNumbers(2, a));
        d = -d;
        double q = dc.divideDoubleNumbers(d, dc.multiplyDoubleNumbers(4, a));
        dc.setP(p);
        dc.setQ(q);
    }
    public static void topFunValue(DoCalculations dc,double b,double a,double d)
    {
        b = -b;
        double p = dc.divideDoubleNumbers(b, dc.multiplyDoubleNumbers(2, a));
        d = -d;
        double q = dc.divideDoubleNumbers(d, dc.multiplyDoubleNumbers(4, a));
        dc.setP(p);
        dc.setQ(q);
        dc.setXw(p);
        dc.setYw(q);
    }
    public static void generalFormOf(DoCalculations dc)
    {       
        println("general form of f() is: "+dc.getA()+"+x^2+"+dc.getB()+"x+"+dc.getC());
    }
    public static void resFunValue(int lx,int rx,DoCalculations dc)
    {
        println("to jest dzialanie metody refFunValue");
        dc.setLx(lx);
        dc.setRx(rx);
        double valueOfA = dc.getA();
        println("valueOfA="+valueOfA);
        double valueOfB = dc.getB();
        double valueOfC = dc.getC();
        double valueOfLx = dc.getLx();
        double valueOfRx = dc.getRx(); 
        double lfirst = dc.multiplyDoubleNumbers(valueOfA,dc.doSecondPower(valueOfLx));
        double lsecond = dc.multiplyDoubleNumbers(valueOfB, valueOfLx);
        double lthird = valueOfC;
        double lresult = lfirst + lsecond +lthird;
        dc.setRes1(lresult);
        println("to jest wynik dc.getRes1: "+dc.getRes1());
        double rfirst = dc.multiplyDoubleNumbers(valueOfA, dc.doSecondPower(valueOfRx));
        println("valueOfA="+valueOfA);
        println("rfirst= "+rfirst);
        double rsecond = dc.multiplyDoubleNumbers(valueOfB, valueOfRx);
        println("rsecond= "+rsecond);
        double rthird = valueOfC;
        println("rthird = "+rsecond);
        double rresult = rfirst + rsecond+rthird;
        dc.setRes2(rresult);
        println("to jest wynik dc.getRes2: "+dc.getRes2());
    }
    public static void productFormOf(DoCalculations dc,double d)
    {
        if (d>0)
        {
            if (dc.getFel()>0 && dc.getSel()>0)
            {
                double x1 = -dc.getFel();
                double x2 = -dc.getSel();
                println("product form of f() is: "+dc.getA()+"(x-"+x1+")("+"x-"+x2+")");    
            }
            
            else if (dc.getFel()>0 && dc.getSel()<0)
            {
                double x1 = -dc.getFel();
                double x2 = -dc.getSel();
                println("product form of f() is: "+ dc.getA()+"("+"x"+x1+")("+"x+"+x2+")");
            }
            else if (dc.getFel()<0 && dc.getSel()>0)
            {
                double x1 = -dc.getFel();
                double x2 = -dc.getSel();
                println("product form of f() is: "+ dc.getA()+"(x+"+x1+")(x"+x2+")");
            }
            else if (dc.getFel()<0 && dc.getSel()<0)
            {
                double x1 = -dc.getFel();
                double x2 = -dc.getSel();                
                println("product form of f() is: "+dc.getA() + "(x-"+x1+")(x+"+ x2+")");
            }
        }
        else if (d==0)
        {
            if (dc.getFel()>0)
            {
                double x1 = -dc.getFel();
                println("to jest delta"+dc.getD());
                println("product form of f() is: "+dc.getA()+"(x"+x1+")");
            }
            else if (dc.getFel()==0)
            {
                double x1 = dc.getFel();
                println("to jest delta"+dc.getD());
                println("product form of f() is: "+dc.getA()+"(x+"+x1+")");
            }
            else if (dc.getFel()<0)
            {
                double x1 = -dc.getFel();
                println("to jest delta"+dc.getD());
                println("product form of f() is: "+dc.getA()+"(x"+x1+")");
            }
        }
        else if (d<0)
        {
            println("no product form because delta is smaller than zero");
        }
            
    }
    public static void canonicFormOf(DoCalculations dc)
    {
        if (dc.getP()>0 && dc.getQ()>0)
        {
            double p = -dc.getP();
            double q = dc.getQ();
            println("canonic form of f() is: "+dc.getA()+"(x"+p+")^2+"+q);
        }
        else if (dc.getP()==0 && dc.getQ()==0)
        {
            double p = dc.getP();
            double q = dc.getQ();
            println("canonic form of f() is: "+dc.getA()+"x^2");
        }
        else if (dc.getP()>0 && dc.getQ()==0)
        {
            double p = -dc.getP();
            double q = dc.getQ();
            println("canonic form of f() is: "+dc.getA()+"(x"+p+")^2");
        }
        else if (dc.getP()==0 && dc.getQ()>0)
        {
            double p = dc.getP();
            double q = -dc.getQ();
            println("canonic form of f() is: "+dc.getA()+"x^2"+q);
        }
        else if (dc.getP()<0 && dc.getQ()>0)
        {
            double p = -dc.getP();
            double q = -dc.getQ();
            println("canonic form of f() is: "+dc.getA()+"(x-"+p+")^2"+q);
        }
        else if (dc.getP()<0 && dc.getQ()<0)
        {
            double p = dc.getP();
            double q = -dc.getQ();
            println("canonic form of f() is: "+dc.getA()+"(x"+p+")^2+"+q);
        }
    }
    public static void xAxisAcross(DoCalculations dc)
    {
        double x1 = dc.getFel();
        double x2 = dc.getSel();
        println("across with x axis: "+"("+x1+"0)"+","+x2+",0)");
    }
    public static void yAxisAcross(DoCalculations dc)
    {
        double c = dc.getC();
        println("across with y axis: "+"(0,"+c+")");
    }
    public static void minmaxValueFun(DoCalculations dc,double d,int lx,int rx,int b,int a)
    {
        dc.setD(d);
        println(dc.getD());
        dc.setA(a);
        dc.setB(b);
        a = dc.getA();
        b = dc.getB();
        dc.setLx(lx);
        dc.setRx(rx);
        int lxlocal;
        if (dc.getD()>0)
        {
            println("max and min function values at delta > 0");
            Scanner sc = new Scanner(System.in);
            do{
                try
                {
                    print("Put the left x value: ");
                    dc.setLx(sc.nextInt());
                    lxlocal = dc.getLx();
                    print("Put the right x value: ");
                    dc.setRx(sc.nextInt());
                    int rxlocal = dc.getRx();
                    resFunValue(lxlocal,rxlocal,dc);
                    println("left x = "+dc.getLx());
                    println("right x = "+dc.getRx());
                    println("parametry wierzcholka");
                    topFunValue(dc,b,a,d);
                    println("xw = "+dc.getXw());
                    println("yw = "+dc.getYw());
                    if (dc.getRes1()<dc.getRes2())
                    {
                        println("w przedziale "+"("+dc.getLx()+","+dc.getRx()+")");
                        println("najmniejsza wartosc to y = "+ dc.getQ());
                        println("najwieksza wartosc to y = "+ dc.getRes2());
                    }
                    else if (dc.getRes1()>dc.getRes2())
                    {
                        println("w przedziale "+"("+dc.getLx()+","+dc.getRx()+")");
                        println("najmniejsza wartosc to y = "+dc.getQ());
                        println("najwieksza wartosc to y = "+dc.getRes1());
                    }
                    break;
                }
                catch(InputMismatchException e)
                {
                    print("Error!!! You have to put Integer Value");
                    println("");
                    sc.next();
                }
            }while(true);
        }
        else if (d==0)
        {
            println("max and min function values at delta = 0");
            Scanner sc = new Scanner(System.in);
            do{
                try{
                    print("Put left x value:");
                    dc.setLx(sc.nextInt());
                    lxlocal = dc.getLx();
                    print("Put rightx value:");
                    dc.setRx(sc.nextInt());
                    int rxlocal = dc.getRx();
                    resFunValue(lxlocal,rxlocal,dc);
                    println("left x = "+dc.getLx());
                    println("right x = "+dc.getRx());
                    println("parametry wierzcholka");
                    topFunValue(dc,b,a,d);
                    println("xw = "+dc.getXw());
                    println("yw = "+dc.getYw());
                    if (dc.getRes1()<dc.getRes2())
                    {
                        println("w przedziale "+"("+dc.getLx()+","+dc.getRx()+")");
                        println("najmniejsza wartosc to y = "+ dc.getQ());
                        println("najwieksza wartosc to y = "+ dc.getRes2());
                    }
                    else if (dc.getRes1()>dc.getRes2())
                    {
                        println("w przedziale "+"("+dc.getLx()+","+dc.getRx()+")");
                        println("najmniejsza wartosc to y = "+dc.getQ());
                        println("najwieksza wartosc to y = "+dc.getRes1());
                    }
                    break;
                }catch(InputMismatchException e)
                {
                    print("Error!!! You have to put Integer Value");
                    println("");
                    sc.next();
                }
            }while(true);
        }
        else if (dc.getD()<0)
        {
            println("max and min function values at delta < 0");
            Scanner sc = new Scanner(System.in);
            do{
                try
                {
                    print("Put left x value: ");
                    dc.setLx(sc.nextInt());
                    lxlocal = dc.getLx();
                    print("Put right x value: ");
                    dc.setRx(sc.nextInt());
                    int rxlocal = dc.getRx();
                    resFunValue(lxlocal,rxlocal,dc);
                    println("left x local = "+dc.getLx());
                    println("right x local = "+dc.getRx());
                    println("parametry wierzcholka");
                    topFunValue(dc,b,a,d);
                    println("xw = "+dc.getXw());
                    println("yw = "+dc.getYw());
                    if (dc.getRes1()<dc.getRes2())
                    {
                        println("w przedziale "+"("+dc.getLx()+","+dc.getRx()+")");
                        println("najmniejsza wartosc to y = "+ dc.getQ());
                        println("najwieksza wartosc to y = "+ dc.getRes2());
                    }
                    else if (dc.getRes1()>dc.getRes2())
                    {
                        println("w przedziale "+"("+dc.getLx()+","+dc.getRx()+")");
                        println("najmniejsza wartosc to y = "+dc.getQ());
                        println("najwieksza wartosc to y = "+dc.getRes1());
                    }
                    break;
                }
                catch(InputMismatchException e)
                {
                    print("Error!!! You have to put Integer Value");
                    println("");
                    sc.next();
                }
            }while(true);
        }
    }
    public static void elementsAmount()
    {
        DoCalculations dc = new DoCalculations();
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        println("Calculate delta Java Console Part Program");
        do {
            try
            {
                println("Put coefficient b = ");
                dc.setB(sc.nextInt());
                b = dc.getB();
                println("Put coefficient a = ");
                dc.setA(sc.nextInt());
                a = dc.getA();
                println("Put coefficient c = ");
                dc.setC(sc.nextInt());
                c = dc.getC();
                double dres = delta(dc,b, a, c);
                if (dres<0) 
                {
                    println("delta is smaller than zero -> no elements->"+dres);
                    println("wartosci p i q");
                    pqValue(dc,b,a,dres);
                    println("p parameter value = "+dc.getP());
                    println("q parameter value = "+dc.getQ());
                    generalFormOf(dc);
                    canonicFormOf(dc);
                    xAxisAcross(dc);
                    yAxisAcross(dc);
                    minmaxValueFun(dc,dres,1,4,(int)b,(int)a);
                }
                else if (dres==0)
                {
                    println("delta equals zero -> one double element -> delta = "+dres);
                    elementsValue(dc,b,a);
                    pqValue(dc,b,a,dres);
                    println("One double element value = "+dc.getFel());
                    println("p parameter value = "+dc.getP());
                    println("q parameter value doesn't exist");
                    generalFormOf(dc);
                    canonicFormOf(dc);
                    xAxisAcross(dc);
                    yAxisAcross(dc);
                    minmaxValueFun(dc,dres,1,4,(int)b,(int)a);
                }
                else if (dres>0)
                {
                    println("delta biger than zero -> two elements -> delta = "+dres);
                    elementsValue(dc,b,a,dres);
                    pqValue(dc,b,a,dres);
                    println("First element value = "+dc.getFel());
                    println("Second element value = "+dc.getSel());
                    println("p parameter value = "+dc.getP());
                    println("q parameter value = "+dc.getQ());
                    generalFormOf(dc);
                    productFormOf(dc,dres);
                    canonicFormOf(dc);
                    xAxisAcross(dc);
                    yAxisAcross(dc);
                    minmaxValueFun(dc,dres,1,4,(int)b,(int)a);
                }
                break;
            }
            catch(InputMismatchException e)
            {
                print("Error!!! You have to put Integer Value");
                println("");
                sc.next();
            }
        }while(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            elementsAmount();
        }
        catch(Exception e)
        {
            println(e);
        }
    }
    
}
