abstract class shape
{
  private double v1,v2;
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
        
    }
}
class Triangle extends shape
{
    Triangle()
    {
        
    }
    Triangle(int v1,int v2)
    {
        super(v1,v2);
    }
}
class Circle extends shape
{
    
}
