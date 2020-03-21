package org.learn.lastChapter.helpers;

import org.learn.lastChapter.animals.Carnivore;

public class AnimalHelper {
  public static <T extends Carnivore> void breath (T source) {
    source.breath();
  }
}
