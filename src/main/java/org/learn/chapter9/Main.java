package org.learn.chapter9;

import org.learn.chapter9.models.Geometry;
import org.learn.chapter9.models.GeometryFactory;

public class Main {
  private final GeometryFactory geometryFactory;

  private Main() {
    geometryFactory = GeometryFactory.getInstance();
  }

  private void run() {
    Geometry rectangle = geometryFactory.createRectangle();
    Geometry triangle = geometryFactory.createTriangle();
    Geometry circle = geometryFactory.createCircle();

    System.out.println(rectangle);
    System.out.println(triangle);
    System.out.println(circle);
  }

  public static void main(String[] args) {
    new Main().run();
  }
}
