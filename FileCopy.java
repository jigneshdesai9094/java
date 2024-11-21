
package javaapplication8;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try
        {
       FileInputStream fis = new FileInputStream(args[0]);
       FileOutputStream fos = new FileOutputStream(args[1]);
       int c=fis.read();
  
       while(c!=-1)
       {
           fos.write(c);
           c=fis.read();
       }
       fos.close();
       fis.close();
        }
        catch(Exception e)
        {
            System.out.println("\n Error : "+e.getMessage());
            e.printStackTrace();
        }
    }
}
