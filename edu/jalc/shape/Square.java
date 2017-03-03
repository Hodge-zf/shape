package edu.jalc.shape;

public class Square extends Rectangle{

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
