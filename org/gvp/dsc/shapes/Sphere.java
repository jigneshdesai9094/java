package org.gvp.dsc.shapes;
public class Sphere {
    public double radius;
    public Sphere(double r)
    {
        this.radius=r;
    }  
    public double surfaceArea()
    {
        return 4*Math.PI*Math.pow(radius,2);
    }
    public double volume()
    {
        return (4*Math.PI*radius*radius*radius)/3;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
