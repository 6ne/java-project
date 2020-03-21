package org.learn.lastChapter.animals;

// final class cannot be inherited
public final class Carnivore extends Animal {
  @Override
  public void move() {
    System.out.println("carnivore is moving");
  }

  @Override
  public void eat() {
    System.out.println("carnivore is eating meat");
  }

  // 'breath()' cannot override 'breath()' in 'org.learn.lastChapter.models.Animal'; overridden method is final
//  @Override
//  public void breath() {
//
//  }
}
