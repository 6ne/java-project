package org.learn.lastChapter.humans;

import org.learn.lastChapter.interfaces.Copyable;

public class Lecturer extends Binusian implements Copyable<Lecturer> {
  public Lecturer(String name, Integer age) {
    super(name, age);
  }

  public Lecturer(Lecturer source) {
    super(source.getName(), source.getAge());
  }

  @Override
  public Lecturer copy() {
    return new Lecturer(this);
  }

  @Override
  public <S extends Binusian> Lecturer transform(S source) {
    this.setName(source.getName());
    this.setAge(source.getAge());

    return this;
  }
}
