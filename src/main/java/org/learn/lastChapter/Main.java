package org.learn.lastChapter;

import org.learn.lastChapter.animals.Carnivore;
import org.learn.lastChapter.animals.Herbivore;
import org.learn.lastChapter.helpers.AnimalHelper;
import org.learn.lastChapter.humans.Lecturer;
import org.learn.lastChapter.humans.Student;
import org.learn.lastChapter.runnables.Data;

public final class Main {
  public static void main(String[] args) {
    // 'Animal' is abstract; cannot be instantiated
//    Animal animal = new Animal();

    Carnivore carnivore = new Carnivore();
    Herbivore herbivore = new Herbivore();

    Student a = new Student("a", 10);
    Student b = a.copy();

    b.setName("b");

    Lecturer c = new Lecturer("c", 100);

    c = c.transform(a);

    System.out.println(a.getName());
    System.out.println(b.getName());
    System.out.println(c.getName());

    AnimalHelper.breath(carnivore);

    // no instance(s) of type variable(s) exist so that Herbivore conforms to Carnivore
//    AnimalHelper.breath(herbivore);

    Data data1 = new Data("data 1");
    Data data2 = new Data("data 2");
    Data data3 = new Data("data 3");


    new Thread(data1).start();
    new Thread(data2).start();
    new Thread(data3).start();
  }
}
