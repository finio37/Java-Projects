/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iooperations1;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author finito
 */
public class IOOperations1 {

    /**
     * @param args the command line arguments
     */
    public static String answer="";
    public static<T> void Println(T t)
    {
        System.out.println(t);
    }
    public static String CanWrite(File f)
    {
        String ans;
        if (f.canWrite()==true)
        {
            ans="Yes";
            return ans;
        }
        else
        {
            ans="No";
            return ans;
        }
    }
    public static String CanRead(File f)
    {
        String ans;
        if (f.canRead()==true)
        {
            ans = "Yes";
            return ans;
        }
        else
        {
            ans = "No";
            return ans;
        }
    }
    public static String CanExecute(File f)
    {
        String ans;
        if (f.canExecute()==true)
        {
            ans="Yes";
            return ans;
        }
        else 
        {
            ans = "No";
            return ans;
        }
    }
    public static String IsHidden(File f)
    {
        String ans;
        if (f.isHidden()==true)
        {
            ans = "Yes";
            return ans;
        }
        else
        {
            ans = "No";
            return ans;
        }
    }
    public static String IsItFile(File f)
    {
        String ans;
        if (f.isFile()==true)
        {
            ans = "Yes";
            return ans;
        }
        else
        {
            ans = "No";
            return ans;
        }
    }
    public static void main(String[] args) {
        try
        {
            File file = new File("file.txt");
            if (!file.exists())
                file.createNewFile();
            Println(file.getCanonicalPath());
            Println(file.getAbsolutePath());
            Println("Can I write?: "+CanWrite(file));
            Println("Can I read?: "+CanRead(file));
            Println("Can I execute?: "+CanExecute(file));
            Println("Does file is hidden?: "+IsHidden(file));
            Println("Is it file?: "+IsItFile(file));
            Println("When the file was modified?: "+new Date(file.lastModified()));
            Println("How long is file?: "+file.length());
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
