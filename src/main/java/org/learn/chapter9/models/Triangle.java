package org.learn.chapter9.models;

public class Triangle extends Geometry {
  private Double height, base;

  private Triangle(Double height, Double base) {
    this.height = height;
    this.base = base;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getBase() {
    return base;
  }

  public void setBase(Double base) {
    this.base = base;
  }

  public static Triangle create(Double height, Double base) {
    return new Triangle(height, base);
  }

  @Override
  public Double getArea() {
    return height * base / 2;
  }

  @Override
  public String toString() {
    return "Triangle{" +
      "height=" + height +
      ", base=" + base +
      ", area=" + getArea() +
      '}';
  }
}
