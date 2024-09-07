abstract class shape
{
  int v1,v2;
  shape()
  {}
  shape(int v1,int v2)
  {
      this.v1=v1;
      this.v2=v2;
  }
  shape(int v)
  {
      this.v1=v;
      this.v2=v;
  }
  abstract double area();
  abstract double perimeter();
}
class Rectangle extends shape
{
    Rectangle()
    {
        v1=12;
        v2=10;
    }
    Rectangle(int v1,int v2)
    {
        super(v1,v2);
    }
    double area()
    {
        return v1*v2;
    }
    double perimeter()
    {
        return 2*(v1+v2);
    }
}
class Triangle extends shape
{
    int v3;
    Triangle()
    {
       v1=10;
       v2=v1;   
       v3=13;
    }
    Triangle(int v1,int v2)
    {
        super(v1);
        v3=v2;
    }
    double area()
    {
        return (v1*v3)/2;
    }
    double perimeter()
    {
        return v1+v2+v3;
    }
}

class Circle extends shape
{
    Circle()
    {
        v2=5;
    }
    Circle(int r)
    {
        super(r);
    }
    double area()
    {
        return 3.14*v2*v2;
    }
    double perimeter()
    {
        return 2*3.14*v2;
    }
}
public class P9
{
  public static void main(String[] args) {
    
  }
}
