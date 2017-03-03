package edu.jalc.shape;

public class Rectangle extends TwoDimensionalShape{

  private double width;
  private double height;

  public Rectangle(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  public double getPerimeter()
  {
    return (width+width) + (height+height);
  }

  public double getArea()
  {
    return height*width;
  }

  public String toString()
  {
    return "The rectangle has a perimeter of " + getPerimeter() + "and an area of " + getArea();
  }
}
