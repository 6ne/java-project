package org.learn.chapter9.models;

public class Rectangle extends Geometry {
  private Double height, width;

  private Rectangle(Double height, Double width) {
    this.height = height;
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public static Rectangle create(Double height, Double width) {
    return new Rectangle(height, width);
  }

  @Override
  public Double getArea() {
    return height * width;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
      "height=" + height +
      ", width=" + width +
      ", area=" + getArea() +
      '}';
  }
}
