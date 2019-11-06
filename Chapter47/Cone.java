// file: Cone.java
//
public class Cone
{
  private double radius;  // radius of the base
  private double height;  // height of the cone
  
  public Cone( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
  }
  
  public double area()
  {
    return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
  }
  
  public double volume()
  {
    return Math.PI*radius*radius*height/3.0;  
  }

  public double slantHeight()
  {
    return Math.sqrt(this.radius * 2 + this.height * 2);
  }
    
  public double angle()
  {
    return Math.atan(this.radius / this.height);
  }  
}