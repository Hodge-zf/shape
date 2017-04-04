package edu.jalc.shape.curved;

import java.lang.Math.*;
import edu.jalc.shape.curved.EllipticalShape;
import edu.jalc.shape.TwoDimensionalShape;

public class Ellipse extends EllipticalShape{

  private double minorAxis, majorAxis;

  private Ellipse()
  {
    super(0,0);
  }

  public Ellipse(double minorAxis, double majorAxis)
  {
    super(minorAxis,majorAxis);
  }

  public double getCircumference()
  {
    return 2*Math.PI*Math.sqrt((Math.pow(minorAxis,2) + Math.pow(majorAxis,2))/2);
  }

  public String toString()
  {
    return "The ellipse has a circumference of " + getCircumference() + "and an area of " + getArea();
  }
}
