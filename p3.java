
package collegejavapro;

import java.util.Scanner;

class Utility
{
    public static long factorial(long value)
    {
        long fact=1;
        for(int i=1;i<=value;i++)
          fact=fact*i;
        return fact;
    }
    public static boolean isPrime(int value)
    {
        int i=0,end=value/2;
        for(i=2;i<=end;i++)
        {
            if(value%i==0)
                break;
        }
        if(i == end+1)
            return  true;
        else
            return  false;
    }
    public static boolean isEven(long value)
    {
        if(value%2==0)
            return true;
        else
            return false;
    }
    public static boolean isOdd(long value)
    {
        return !isEven(value);
    }
}
public class p3 {
    public static void main(String[] args) {
        int no;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter One Number : ");
        no=s1.nextInt();
        System.out.println(no+" factorial is : "+Utility.factorial(no));
        if(Utility.isPrime(no))
            System.out.println(no+" is Prime Number");
       else
            System.out.println(no+" is Not Prime Number");
       if(Utility.isEven(no))
            System.out.println(no+" is Even Number");
       if(Utility.isOdd(no))
            System.out.println(no+" is Odd Number");
      
    }
 
}
