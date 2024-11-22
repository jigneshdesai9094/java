import java.io.BufferedReader;
import java.io.FileReader;

public class P142 {
    public static void main(String[] args) {
        try
        {
        BufferedReader br = new BufferedReader(new FileReader("studentinfo.txt"));
        String line = br.readLine();
        System.out.printf("%5s %10s %5s %5s %5s %9s %14s","RollNo","Name","sub1","sub2","sub3","total","percentage");
        while(line!=null)
        {
            String lw[]=line.split("\t");
            int sub1 = Integer.parseInt(lw[2]);
            int sub2 = Integer.parseInt(lw[3]);
            int sub3 = Integer.parseInt(lw[4]);
            int total = sub1+sub2+sub3;
            double per = total/3.0;
            System.out.println();
            System.out.printf("%5s %10s %5d %5d %5d %9d %14.2f",lw[0],lw[1],sub1,sub2,sub3,total,per);
            
            line=br.readLine();
        }
        br.close();
    }
    catch(Exception e)
    {
        System.err.println("Error : "+e.getMessage());
        e.printStackTrace();
    }
    }
}
