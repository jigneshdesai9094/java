


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
public class P3 {
    public static void main(String[] args) {
        int no;
        Scanner s1=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Factorial");
			System.out.println("2.Prime");
			System.out.println("3.Even");
			System.out.println("4.Odd");
			System.out.println("5.exit");
			System.out.println("Please Enter Your choice");
			int choice=s1.nextInt();
			System.out.println("Enter One Number : ");
            no=s1.nextInt();
			switch(choice)
			{
				case 1: System.out.println(no+" factorial is : "+Utility.factorial(no));
				       break;
			    case 2:   if(Utility.isPrime(no))
                              System.out.println(no+" is Prime Number");
                          else
                              System.out.println(no+" is Not Prime Number");
		                  break;
				case 3:
                         if(Utility.isEven(no))
                              System.out.println(no+" is Even Number");
						 else
							  System.out.println(no+" is Not Even Number");
						  break;
			   case 4:
                        if(Utility.isOdd(no))
                             System.out.println(no+" is Odd Number");
						else
							System.out.println(no+" is Not Odd Number");
						break;
			  case 5:System.exit(0);
			}
		}
      
       
     
      
    }
 
}