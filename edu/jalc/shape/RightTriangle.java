package edu.jalc.shape;

import java.lang.Math.*;

public class RightTriangle extends TwoDimensionalShape{

  private double width;
  private double height;

  private RightTriangle()
  {
    this.width = 0;
    this.height = 0;
  }

  private RightTriangle(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  public double getPerimeter()
  {
    double hypotenuse = Math.sqrt( Math.pow(this.width, 2) + Math.pow(this.height, 2) );
    return hypotenuse + this.width + this.height;
  }

  public double getArea()
  {
    return (this.height*this.width)*0.5;
  }

  public String toString()
  {
    return "The triangle has a perimeter of " + getPerimeter() + "and an area of " + getArea();
  }
}
