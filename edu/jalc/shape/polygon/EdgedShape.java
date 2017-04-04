package edu.jalc.shape.polygon;

import edu.jalc.shape.TwoDimensionalShape;

abstract public class EdgedShape extends TwoDimensionalShape{

  public double width;
  public double height;

  public EdgedShape(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  public double getPerimeter()
  {
    return this.width+this.width + this.height+this.height;
  }
}
