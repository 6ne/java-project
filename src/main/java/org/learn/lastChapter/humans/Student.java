package org.learn.lastChapter.humans;

import org.learn.lastChapter.interfaces.Copyable;

public class Student extends Binusian implements Copyable<Student> {

  public Student() {
    super("", 0);
  }

  // overloading
  public Student(String name) {
    super(name, 0);
  }

  public Student(Integer age) {
    super("", age);
  }

  public Student(String name, Integer age) {
    super(name, age);
  }

  @Override
  public Student copy() {
    return new Student(this.getName(), this.getAge());
  }

  @Override
  public <S extends Binusian> Student transform(S source) {
    return new Student(source.getName(), source.getAge());
  }
}
