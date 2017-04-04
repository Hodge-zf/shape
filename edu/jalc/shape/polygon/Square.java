package edu.jalc.shape.polygon;
import edu.jalc.shape.TwoDimensionalShape;

public final class Square extends Rectangle{

  private double side;

  private Square()
  {
    super(0.0,0.0);
  }

  public Square(double side)
  {
    super(side,side);
  }

  public String toString()
  {
  return "The square has a perimeter of " + getPerimeter() + " and an area of " + getArea();
  }

}
