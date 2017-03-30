package edu.jalc.shape.polygon;

import edu.jalc.shape.TwoDimensionalShape;

public class Rectangle extends TwoDimensionalShape{

  private double width;
  private double height;

  private Rectangle()
  {
    this.width = 0;
    this.height = 0;
  }

  public Rectangle(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  public final double getPerimeter()
  {
    return this.width+this.width + this.height+this.height;
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
