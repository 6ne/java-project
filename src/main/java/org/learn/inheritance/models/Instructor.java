package org.learn.inheritance.models;

import org.learn.inheritance.enums.BinusianType;
import org.learn.inheritance.interfaces.CanTeach;

// instructor extends Students means, instructor has everything that owned by Student & Binusian
// instrucor implements CanTeach, so it must overriding all method inside the CanTeach interfaces
public class Instructor extends Student implements CanTeach {
  private static int counter = 0;
  private final String instructorId;
  private Integer salary;

  public Instructor(String name, String major, Integer semester, Integer salary) {
    // super is calling constructor of Student
    super(name, major, semester);
    this.salary = salary;
    setType(BinusianType.INSTRUCTOR);
    instructorId = String.format("IN%09d", ++counter);
  }

  public String getInstructorId() {
    return instructorId;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  @Override
  public void teach() {
    System.out.println("instructor teaching");
  }
}
