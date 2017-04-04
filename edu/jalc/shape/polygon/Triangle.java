package edu.jalc.shape.polygon;

import edu.jalc.shape.TwoDimensionalShape;

abstract public class Triangle extends EdgedShape{

  public double width;
  public double height;

  private Triangle()
  {
    super(0,0);
  }
  public Triangle(double width, double height)
  {
    super(width,height);
  }

  public double getArea()
  {
    return (this.height*this.width)*0.5;
  }
}
