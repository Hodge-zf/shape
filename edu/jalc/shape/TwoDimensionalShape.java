package edu.jalc.shape;

abstract public class TwoDimensionalShape{

    abstract public double getPerimeter();
    abstract public double getArea();
    abstract public String toString();

    public final boolean equals(TwoDimensionalShape sourceShape){
      return this.getArea()==sourceShape.getArea();
    }
}
