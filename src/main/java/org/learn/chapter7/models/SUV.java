package org.learn.chapter7.models;

public class SUV extends Car {
  public SUV(String name) {
    super(15, 100, name);
  }

  @Override
  public String toString() {
    return String.format("SUV{capacity: %d, speed: %d, name: %s}", getCapacity(), getSpeed(), getName());
  }
}
