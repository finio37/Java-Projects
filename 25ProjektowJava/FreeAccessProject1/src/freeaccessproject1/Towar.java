/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeaccessproject1;
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
/**
 *
 * @author finito
 */
public class Towar {
    private double price;
    private String name;
    private Date realaseDate;
    public Towar()
    {
        this.price = 0.0;
        this.name = " ";
        this.realaseDate = new GregorianCalendar().getTime();
    }
    public Towar(double price, String name)
    {
        this();//spradzic przez wyswietlenie
        this.price = price;
        this.name = name;
        
    }
    public Towar(double price,String name,int y,int m, int d)
    {
        this(price,name);
        GregorianCalendar calendar = new GregorianCalendar(y,m-1,d);
        this.realaseDate = calendar.getTime();
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
    public Date getDate()
    {
        return this.realaseDate;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDate(int y,int m, int d)
    {
        GregorianCalendar calendar = new GregorianCalendar(y,m-1,d);
        this.realaseDate = calendar.getTime();
    }
    public String toString()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(realaseDate);
        return this.price+" zł; nazwa: "+this.name+" "+calendar.get(Calendar.YEAR)+" rok "+(calendar.get(Calendar.MONTH)+1)+" m "+calendar.get(Calendar.DAY_OF_MONTH)+" dz ";
    }
    public static void saveToFile(Towar[] towar,PrintWriter outS)
    {
        GregorianCalendar calendar = new GregorianCalendar();
        for (int i=0;i<towar.length;i++)
        {
            calendar.setTime(towar[i].getDate());
            outS.println(towar[i].getPrice()+"|"+towar[i].getName()+"|"+(calendar.get(Calendar.YEAR)+1)+"|"+calendar.get(Calendar.MONTH)+"|"+calendar.get(Calendar.DAY_OF_MONTH));
        }
    }
    public static Towar[] readFromFile(BufferedReader inS) throws IOException
    {
        int linesCount = Integer.parseInt(inS.readLine());
        Towar[] towar = new Towar[linesCount];
        for (int i=0;i<linesCount;i++)
        {
            //read line
            String line = inS.readLine();
            //tokening
            StringTokenizer tokens = new StringTokenizer(line,"|");
            double price = Double.parseDouble(tokens.nextToken());
            String name = tokens.nextToken();
            int y = Integer.parseInt(tokens.nextToken());
            int m = Integer.parseInt(tokens.nextToken());
            int d = Integer.parseInt(tokens.nextToken());
            towar[i]= new Towar(price,name,y,m,d);
        }
        return towar;
    }
    
    
}
