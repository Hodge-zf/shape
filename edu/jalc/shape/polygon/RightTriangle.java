package edu.jalc.shape.polygon;

import java.lang.Math.*;
import edu.jalc.shape.TwoDimensionalShape;

public final class RightTriangle extends Triangle{

  private double width;
  private double height;

  private RightTriangle()
  {
    super(0,0);
  }

  public RightTriangle(double width, double height)
  {
    super(width,height);
  }

  public final double getPerimeter()
  {
    return Math.hypot(this.width,this.height) + this.width + this.height;
  }

  public String toString()
  {
    return "The triangle has a perimeter of " + getPerimeter() + "and an area of " + getArea();
  }
}
