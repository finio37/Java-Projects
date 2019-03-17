/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iooperations3;
import java.io.*;
/**
 *
 * @author finito
 */
public class IOOperations3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            File file = new File("file.txt");
            if (!file.exists())
                file.createNewFile();
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            ((BufferedWriter)writer).write("This is the first line");
            ((BufferedWriter)writer).newLine();
            ((BufferedWriter)writer).write("And this is the second line");
            ((BufferedWriter)writer).newLine();
            ((BufferedWriter)writer).write("And this is the third line");
            ((BufferedWriter)writer).close();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
    }
    
}
