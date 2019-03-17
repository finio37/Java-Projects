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
public interface Calculate {
    //add two integer numbers
    public int addIntegerNumbers(int a,int b);
    //add two double numbers
    public double addDoubleNumbers(double a,double b);
         
    //multiply two integer numbers
    public int multiplyIntegerNumbers(int a, int b);
    //multiply two double numbers
    public double multiplyDoubleNumbers(double a, double b);
       
    //subtract two integer numbers
    public int subtractIntegerNumbers(int a, int b);
    //subtract two double numbers
    public double subtractDoubleNumbers(double a, double b);
    
    //divide  two integer numbers
    public int divideIntegerNumbers(int a, int b);
    //divide two double numbers
    public double divideDoubleNumbers(double a, double b);
    
    //public double delta(DoCalculations dc,double b,double a,double c);
    
    public double doSecondPower(double p);
    //public double firstElementValue(int b,double d,int a);
   // public double secondElementValue(int b,double d,int a);
    
}
