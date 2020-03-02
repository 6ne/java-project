package org.learn.chapter7.models;

public class Jeep extends Car {
  public Jeep(String name) {
    super(30, 120, name);
  }

  @Override
  public String toString() {
    return String.format("Jeep{capacity: %d, speed: %d, name: %s}", getCapacity(), getSpeed(), getName());
  }
}
