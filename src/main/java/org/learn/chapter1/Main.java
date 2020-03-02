package org.learn.chapter1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator simpleCalculator = new Calculator();

    boolean isOnFirstRun = true;
    int operator;
    double operand = 0;
    for(;;) {
      simpleCalculator.showHeader();

      if (isOnFirstRun) {
        System.out.print("Input number: ");
        operand = scanner.nextDouble();
        simpleCalculator.total = operand;
        isOnFirstRun = false;
      }

      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Modulo");
      System.out.println("6. Clear Total");
      System.out.println("7. Exit");

      do {
        System.out.print("Operator [1...7]: ");
        operator = scanner.nextInt();
      } while (operator < 1 || operator > 7);

      if (operator != 6 && operator != 7) {
        System.out.print("Input number: ");
        operand = scanner.nextDouble();
      }

      switch (operator) {
        case 1: simpleCalculator.add(operand);
        break;
        case 2: simpleCalculator.sub(operand);
        break;
        case 3: simpleCalculator.mul(operand);
        break;
        case 4: simpleCalculator.div(operand);
        break;
        case 5: simpleCalculator.mod(operand);
        break;
        case 6: simpleCalculator.clear();
        break;
        case 7: return;
      }
    }
  }
}
