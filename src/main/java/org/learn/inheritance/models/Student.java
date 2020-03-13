package org.learn.inheritance.models;

import org.learn.inheritance.enums.BinusianType;

public class Student extends Binusian {
  private static int counter = 0;
  private final String studentId;
  private String major;
  private Integer semester;

  public Student(String name, String major, Integer semester) {
    //calling binusian constructor
    super(name, BinusianType.STUDENT);
    this.major = major;
    this.semester = semester;
    studentId = String.format("ST%09d", ++counter);
  }

  public String getStudentId() {
    return studentId;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public Integer getSemester() {
    return semester;
  }

  public void setSemester(Integer semester) {
    this.semester = semester;
  }
}
