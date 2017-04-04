package edu.jalc.shape.curved;

import edu.jalc.shape.TwoDimensionalShape;

abstract public class EllipticalShape extends TwoDimensionalShape{

  public double minorAxis;
  public double majorAxis;


  public EllipticalShape(double minorAxis, double majorAxis)
  {
    this.minorAxis = minorAxis;
    this.majorAxis = majorAxis;
  }

  public final double getArea()
  {
    return Math.PI*minorAxis*majorAxis;
  }

  abstract double getCircumference();
}
