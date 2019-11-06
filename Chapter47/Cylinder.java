// file: Cylinder.java
//
public class Cylinder
{
  private double radius;  // radius of the base
  private double height;  // height of the cone
  
  public Cylinder( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
  }
  
  public double volume()
  {
    return Math.PI * this.radius * this.radius * this.height;
  }
  
  public double surfaceArea()
  {
    return (2 * Math.PI * this.radius * this.radius) + (2 * Math.PI * this.radius * this.height);
  }


}