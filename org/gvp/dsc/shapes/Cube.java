package org.gvp.dsc.shapes;
public class Cube {
  private double a;
  public Cube(double a)
  {
    this.a=a;
  }
  public double surfaceArea()
  {
    return 6*Math.pow(a,2);
  }
  public double volume()
  {
    return Math.pow(a,3);
  }
  public double diagonal()
  {
    return a*Math.sqrt(3);
  }
}
