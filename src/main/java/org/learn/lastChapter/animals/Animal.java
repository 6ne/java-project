package org.learn.lastChapter.animals;

// cannot creating object from abstract class
public abstract class Animal {

  // abstract function must be overridden
  public abstract void move();

  // final function can't be overridden
  public final void breath() {
    System.out.println("animal is breathing the same air");
  }

  // normal function
  public void eat() {
    System.out.println("animal is eating anything");
  }
}
