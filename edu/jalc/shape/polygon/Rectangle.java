package edu.jalc.shape.polygon;

import edu.jalc.shape.TwoDimensionalShape;

public class Rectangle extends EdgedShape{

  private double width;
  private double height;

  private Rectangle()
  {
    super(0,0);
  }

  public Rectangle(double width, double height)
  {
    super(width,height);
  }

  public double getPerimeter()
  {
    return this.height*2+this.width*2;
  }
  public final double getArea()
  {
    return this.height*this.width;
  }

  public String toString()
  {
    return "The rectangle has a perimeter of " + getPerimeter() + "and an area of " + getArea();
  }
}
