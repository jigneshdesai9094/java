

import java.util.Scanner;

class Number
{
    private double value;

    public Number(double d) {
        value=d;
    }
    public boolean isZero()
    {
        if(value==0)
            return true;
        else
            return false;
    }
    public boolean isPositive()
    {
        if(value>0)
            return true;
        else
            return false;
    }
    public boolean isNegative()
    {
        return !isPositive();
    }
    public boolean isEven()
    {
        if(value%2==0)
            return true;
        else
            return false;
    }
    public boolean isOdd()
    {
        return !isEven();
    }
    public double getFactorial()
    {
        double fact=1;
        for(int i=1;i<=(int)value;i++)
          fact=fact*i;
        return fact;
    }
}
public class P4 {
    public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			int no=1;
        while(true)
		{
			System.out.println("1.IsZero");
			System.out.println("2.IsPositive");
			System.out.println("3.IsNegative");
			System.out.println("4.IsOdd");
			System.out.println("5.IsEven");
			System.out.println("6.Factorial");
			System.out.println("7.exit");
			System.out.println("Please Enter Your choice");
			int choice=s1.nextInt();
			if(choice!=7)
			{
			  System.out.println("Enter One Number : ");
              no=s1.nextInt();
			  
			}
			Number n=new Number(no);
			switch(choice)
			{
				 case 1:if(n.isZero())
                             System.out.println(no+" is Zero");
						else
							System.out.println(no+" is Not Zero");
						break;
                 case 2:if(n.isPositive())
                            System.out.println(no+" is Positive");
						else
							System.out.println(no+" is Not Positive");
						break;
				case 3: if(n.isNegative())
                            System.out.println(no+" is Negative");
					    else
							System.out.println(no+" is Not Negative");
						break;
				case 4:if(n.isOdd())
                          System.out.println(no+" is Odd");
					   else
						  System.out.println(no+" is Not Odd");
					  break;
			   case 5:if(n.isEven())
                           System.out.println(no+" is Even");
					   else
						   System.out.println(no+" is Not Even");
					  break;
			  case 6: System.out.println(no+" factorial is : "+n.getFactorial());
			          break;
			  case 7:System.exit(0);
        
			}
  
        
       
    }
	}
}