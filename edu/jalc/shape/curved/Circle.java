package edu.jalc.shape.curved;
import java.lang.Math.*;

public class Circle extends Ellipse{

  private final double radius;
  
  private Circle()
  {
    super(0.0,0.0);
    this.radius=0;
  }

  public Circle(double radius)
  {
    super(radius, radius);
    this.radius=radius;
  }

  public double getPerimeter()
  {
    return 2*Math.PI*radius;
  }

  public String toString()
  {
    return "The circle has a perimeter of " + getPerimeter() + "and an area of " + getArea();
  }
}
