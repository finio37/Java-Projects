/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iooperations2;
import java.io.*;

/**
 *
 * @author finito
 */
public class IOOperations2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            File file = new File("file.txt");
            if (!file.exists())
            file.createNewFile();
            //InputStream inStream;
            //OutputStream outStream;
           // Reader reader;
            Writer writer = new FileWriter("file.txt");
            writer.write("This is a new content of string file");
            
            writer.close();
            
        }
        catch(IOException ex)
        {
            ex.getMessage();
        }
    }
    
}
