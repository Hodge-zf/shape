package edu.jalc.shape;

public class Square extends Rectangle{

  private double side;

  public Square(double side)
  {
    super(side,side);
  }

  public String toString()
  {
  return "The square has a perimeter of " + getPerimeter() + " and an area of " + getArea();
  }

}
