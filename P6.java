import java.util.*;
class Circle
{
	private double x,y,r;
	Circle()
	{
		x=2;
		y=3;
		r=5;
	}
	Circle(int r)
	{
		x=4;
		y=5;
		this.r=r;
	}
	Circle(int l,int r)
	{
		this.x=l;
		this.y=l;
		this.r=r;
	}
	Circle(int x,int y,int r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
	double area()
	{
		return 3.14*r*r;
	}
	double circumference()
	{
		return 2*3.14*r;
	}
	double diameter()
	{
		return 2*r;
	}
}
class P6
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    while(true)
	    {
		System.out.println("1.Default Circle");
		System.out.println("2.Specific radius cirlce");
		System.out.println("3.Specific same coordinate and radius circle");
		System.out.println("4.Specific different coordinate and radius circle");
		System.out.println("5.Exit");
		System.out.println("\nEnter your choice");
		int choice=sc.nextInt();
		switch(s1)
		{
		    case 1:Circle s1=new Circle();
		    		System.out.println("Area of s1 = "+s1.area());
		            System.out.println("Circumference of s1 = "+s1.circumference());
		            System.out.println("Diameter of s1 = "+s1.diameter());
		            break;
		  case 2:System.out.println("\nEnter Circle radius : ");
		         int r=sc.nextInt();
		         Circle s2=new Circle(r);
		         
		          System.out.println("\n\nArea of s2 = "+s2.area());
		          System.out.println("Circumference of s2 = "+s2.circumference());
		          System.out.println("Diameter of s2 = "+s2.diameter());
		          break;
		  case 3:
		}
		

		Circle s3=new Circle(20,4);
		Circle s4=new Circle(60,60,10);

		System.out.println("\n\nArea of s3 = "+s3.area());
		System.out.println("Circumference of s3 = "+s3.circumference());
		System.out.println("Diameter of s3 = "+s3.diameter());
		System.out.println("\n\nArea of s4 = "+s4.area());
		System.out.println("Circumference of s4 = "+s4.circumference());
		System.out.println("Diameter of s4 = "+s4.diameter());
		
	    }
	}
}
