package org.learn.chapter7.models;

public class Car {
  private Integer capacity;
  private Integer speed;
  private String name;

  public Car(Integer capacity, Integer speed, String name) {
    setCapacity(capacity);
    setSpeed(speed);
    setName(name);
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
