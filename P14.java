
package javaapplication8;
import java.io.*;
public class P14 {
    public static void main(String[] args) {
        try
        {
        File f = new File(".studentinfo.txt");
        if(f.exists())
        {
         BufferedReader br = new BufferedReader(new FileReader(f));
         String line=br.readLine();
        String []lw=line.split("\t");
        for(int i=0;i<lw.length;i++)
        {
            System.out.println(lw[i]);
        }
        }
        else
        {
            System.err.println("\nFile Not Found");
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
