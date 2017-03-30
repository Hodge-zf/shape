package edu.jalc.shape;

import edu.jalc.shape.TwoDimensionalShape;
import edu.jalc.shape.curved.Ellipse;
import edu.jalc.shape.curved.Circle;
import edu.jalc.shape.polygon.Rectangle;
import edu.jalc.shape.polygon.Square;
import edu.jalc.shape.polygon.RightTriangle;

public class ShapeDriver{
  public static void main(String[] args){

    Ellipse ellipse = new Ellipse(4, 10);
    Circle circle = new Circle(7);
    Rectangle rectangle = new Rectangle(25,4);
    Square square = new Square(10);
    RightTriangle rightTriangle = new RightTriangle(50,4);

    System.out.println(ellipse.equals(circle));
    System.out.println(ellipse.equals(square));
    System.out.println(ellipse.equals(rightTriangle));
    System.out.println(circle.equals(square));
    System.out.println(circle.equals(rightTriangle));
    System.out.println(rectangle.equals(square));
    System.out.println(rectangle.equals(circle));
    System.out.println(rectangle.equals(ellipse));
    System.out.println(square.equals(rightTriangle));
    System.out.println(rightTriangle.equals(rectangle));
  }
}
