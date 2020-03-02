package org.learn.chapter9.models;

import java.util.Objects;
import java.util.Scanner;

public class GeometryFactory {
  private static GeometryFactory instance;
  private Scanner scanner;

  private GeometryFactory() {
    this.scanner = new Scanner(System.in);
  }

  public static GeometryFactory getInstance() {
    if (Objects.isNull(instance)) {
      instance = new GeometryFactory();
    }

    return instance;
  }

  public Geometry createRectangle() {
    System.out.println("Create rectangle: ");
    System.out.print("Input height: ");
    Double h = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Input width: ");
    Double w = scanner.nextDouble();
    scanner.nextLine();

    return Rectangle.create(h, w);
  }

  public Geometry createTriangle() {
    System.out.println("Create triangle: ");
    System.out.print("Input height: ");
    Double h = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Input base: ");
    Double b = scanner.nextDouble();
    scanner.nextLine();

    return Triangle.create(h, b);
  }

  public Geometry createCircle() {
    System.out.println("Create circle: ");
    System.out.print("Input radius: ");
    Double r = scanner.nextDouble();
    scanner.nextLine();

    return Circle.create(r);
  }
}
