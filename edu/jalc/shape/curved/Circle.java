package edu.jalc.shape.curved;
import java.lang.Math.*;

public class Circle extends Ellipse{

  private double diameter;

  private Circle()
  {
    super(0.0,0.0);
  }

  public Circle(double diameter)
  {
    super(diameter,diameter);
  }

  public final double getCircumference()
  {
    return Math.PI*diameter;
  }

  public String toString()
  {
    return "The circle has a circumference of " + getCircumference() + "and an area of " + getArea();
  }
}
