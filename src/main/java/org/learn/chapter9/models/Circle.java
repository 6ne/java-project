package org.learn.chapter9.models;

public class Circle extends Geometry {
  private Double radius;

  private Circle(Double radius) {
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public static Circle create(Double radius) {
    return new Circle(radius);
  }

  @Override
  public Double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
      "radius=" + radius +
      ", area=" + getArea() +
      '}';
  }
}
