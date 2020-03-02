package org.learn.chapter7.models;

public class Sedan extends Car {
  public Sedan(String name) {
    super(10, 120, name);
  }

  @Override
  public String toString() {
    return String.format("Sedan{capacity: %d, speed: %d, name: %s}", getCapacity(), getSpeed(), getName());
  }
}
