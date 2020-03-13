package org.learn.inheritance.enums;

import java.util.Arrays;
import java.util.List;

public enum BinusianType {
  // an enum to defined binusian type
  STUDENT, LECTURER, INSTRUCTOR, UNDEFINED;

  public Boolean isUndefined() {
    return UNDEFINED.equals(this);
  }

  public Boolean isDefined() {
    return !isUndefined();
  }

  public Boolean isStudent() {
    return STUDENT.equals(this);
  }

  public Boolean isLecturer() {
    return LECTURER.equals(this);
  }

  public Boolean isInstructor() {
    return INSTRUCTOR.equals(this);
  }
}

