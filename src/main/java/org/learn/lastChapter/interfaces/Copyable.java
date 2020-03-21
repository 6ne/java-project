package org.learn.lastChapter.interfaces;

import org.learn.lastChapter.humans.Binusian;

public interface Copyable<T> {
  T copy();
  <S extends Binusian> T transform (S source);
}
