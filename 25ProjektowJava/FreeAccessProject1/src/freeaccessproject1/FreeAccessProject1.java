/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeaccessproject1;
import java.io.*;
/**
 *
 * @author finito
 */
public class FreeAccessProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Towar[] ware = new Towar[3];
        ware[0] = new Towar();
        ware[1] = new Towar(29.0,"Film Video");
        ware[2] = new Towar(39.0, "Film Video 2", 2008, 11, 21);
        try
        {
            /*File file = new File("baza.txt");
            if (!file.exists())
                file.createNewFile();*/
            PrintWriter writer = new PrintWriter(new FileWriter("baza.txt"));
            Towar.saveToFile(ware, writer);
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("baza.txt"));
            Towar[] wareReading = Towar.readFromFile(reader);
            for (int i=0;i<wareReading.length;i++)
            {
                System.out.println(wareReading[i]);
            }
            reader.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
