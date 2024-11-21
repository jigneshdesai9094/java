
package javaapplication8;

import java.util.Scanner;

interface shapes
{

 double area();
 double perimeter();
}
class Rectangle1 implements shapes
{
  int l,w;
    Rectangle1()
    {
        l=12;
        w=10;
    }
    Rectangle1(int v1,int v2)
    {
        this.l=v1;
        this.w=v2;
    }
    public double area()
    {
              return l*w;
    }
    public double perimeter()
    {
        return 2*(l+w);
    }
}
class Triangle1 implements shapes
{
    int h,b;
    Triangle1()
    {
       h=10;
       b=15;   
    }
    Triangle1(int v1,int v2)
    {
        this.h=v1;
        this.b=v1;
       
    }
   public double area()
    {
        return (h*b)/2.0;
    }
   public double perimeter()
    {
        return (2*h)+b;
    }
}

class Circle1 implements shapes
{
  int r;
    Circle1()
    {
        r=5;
    }
    Circle1(int r)
    {
        r=r;
    }
   public double area()
    {
        return 3.14*r*r;
    }
   public  double perimeter()
    {
        return 2*3.14*r;
    }
}
public class P10 {
static Scanner sc=new Scanner(System.in);
  public static void operation(shapes s)
  {
    while (true)
    {
        System.out.println("\n1.Area");
        System.out.println("2.Perimeter");
        System.out.println("3.exit");
        System.out.println("Enter operation no : ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:System.out.println("\nArea : "+s.area());
                   break;
            case 2:System.out.println("Perimeter : "+s.perimeter());
                    break;
            case 3:
                   return;
            default:System.out.println("please,enter valid choice");
        }
    }
  }
  public static void main(String[] args) {
  while (true) {
    
 
    System.out.println("\nVarious shape to perform operation : ");
    System.out.println("1.Rectangle");
    System.out.println("2.Triangle");
    System.out.println("3.Circle");
    System.out.println("4.exit");
    System.out.println("Enter Shape no to perform operation  : ");
    int choice=sc.nextInt();
    if(choice==1)
    {
       System.out.println("\n1.User Default size Rectangle");
       System.out.println("2.Use Specific size Rectangle");
       System.out.println("Enter No Specific Rectange Use : ");
       int c=sc.nextInt();
       if(c==1)
       {
         Rectangle1  r = new Rectangle1();
         operation(r);
       }
       else if(c==2)
       {
         int l,b;
         System.out.println("\nEnter l and b : ");
         l=sc.nextInt();
         b=sc.nextInt();
         Rectangle1 r=new Rectangle1(l,b);
         operation(r);
       }
       else
         System.out.println("please,enter valid choice");
    }
    else if(choice==2)
    {
        System.out.println("1.User Default size Triangle");
       System.out.println("2.Use Specific size Triangle");
       System.out.println("Enter No Specific Triangle Use : ");
       int c=sc.nextInt();
       if(c==1)
       {
         Triangle1  r = new Triangle1();
         operation(r);
       }
       else if(c==2)
       {
         int l,b;
         System.out.println("\nEnter height and base : ");
         l=sc.nextInt();
         b=sc.nextInt();
         Triangle1 r=new Triangle1(l,b);
         operation(r);
       }
       else
         System.out.println("please,enter valid choice");
    }
    else if(choice==3)
    {
        System.out.println("1.User Default size Circle");
        System.out.println("2.Use Specific size Circle");
        System.out.println("Enter No Specific Circle Use : ");
        int c=sc.nextInt();
        if(c==1)
        {
          Circle1  r = new Circle1();
          operation(r);
        }
        else if(c==2)
        {
          int l,b;
          System.out.println("\nEnter Circle Radius ");
          l=sc.nextInt();
        
          Circle1 r=new Circle1(l);
          operation(r);
        }
        else
          System.out.println("please,enter valid choice");
    }
    else if(choice==4)
      System.exit(0);
    else
      System.out.println("\nPlease,entr valid choice");
  }
}
}

    

