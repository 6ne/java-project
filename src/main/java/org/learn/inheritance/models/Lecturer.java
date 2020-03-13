package org.learn.inheritance.models;

import org.learn.inheritance.enums.BinusianType;
import org.learn.inheritance.interfaces.CanTeach;


// lecturer extends Binusian means, lecturer has everything that owned by Binusian
// lecturer implements CanTeach, so it must overriding all method inside the CanTeach interfaces
public class Lecturer extends Binusian implements CanTeach {
  private static int counter = 0;
  private final String lecturerId;
  private Integer salary;

  public Lecturer(String name, Integer salary) {
    // calling Binusian construcor
    super(name, BinusianType.LECTURER);
    this.salary = salary;
    lecturerId = String.format("LE%09d", ++counter);
  }

  public String getLecturerId() {
    return lecturerId;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  @Override
  public void teach() {
    System.out.println("lecturer teaching ");
  }
}
