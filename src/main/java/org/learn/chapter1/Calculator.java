package org.learn.chapter1;

public class Calculator {
  double total = 0.0;

  public void add(double arg) {
    total += arg;
  }

  public void sub(double arg) {
    total -= arg;
  }

  public void mul(double arg) {
    total *= arg;
  }

  public void div(double arg) {
    total /= arg;
  }

  public void mod(double arg) {
    total %= arg;
  }

  public void clear() {
    total = 0;
  }

  public void showHeader() {
    for(int i = 0 ; i < 25 ; ++i) System.out.println();
    System.out.println("Calculator");
    System.out.println("===============");
    System.out.println("Total = " + total);
    System.out.println("\n");
  }

}
