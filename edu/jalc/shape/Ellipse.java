package edu.jalc.shape;

public class Ellipse extends TwoDimensionalShape{

  private double minorAxis, majorAxis;

  private Ellipse()
  {
    this.minorAxis=0;
    this.majorAxis=0;
  }

  public Ellipse(double minorAxis, double majorAxis)
  {
    this.minorAxis=minorAxis;
    this.majorAxis=majorAxis;
  }
}
