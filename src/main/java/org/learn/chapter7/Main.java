package org.learn.chapter7;

import org.learn.chapter7.models.Car;
import org.learn.chapter7.models.Jeep;
import org.learn.chapter7.models.SUV;
import org.learn.chapter7.models.Sedan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private Scanner scanner;
  private List<Jeep> jeepList;
  private List<SUV> suvList;
  private List<Sedan> sedanList;

  private Main() {
    scanner = new Scanner(System.in);
    jeepList = new ArrayList<>();
    suvList = new ArrayList<>();
    sedanList = new ArrayList<>();
  }

  private void run() {
    int menu = -1;
    while( menu != 3 ) {
      for (int i = 0; i < 25; ++i) System.out.println();

      System.out.println("1. Buy");
      System.out.println("2. Show");
      System.out.println("3. Exit");

      do {
        try {
          System.out.print("Input: ");
          menu = scanner.nextInt();
        } catch (Exception e) {
          menu = -1;
        } finally {
          scanner.nextLine();
        }
      } while (menu < 1 || menu > 3);

      switch (menu) {
        case 1: {
          int target = -1;
          System.out.println("1. Jeep");
          System.out.println("2. SUV");
          System.out.println("3. Sedan");

          do {
            try {
              System.out.print("Input: ");
              target = scanner.nextInt();
            } catch (Exception e) {
              target = -1;
            } finally {
              scanner.nextLine();
            }
          } while (target < 1 || target > 3);

          System.out.print("Name: ");
          String name = scanner.nextLine();

          switch (target) {
            case 1: jeepList.add(new Jeep(name));
            break;
            case 2: suvList.add(new SUV(name));
            break;
            case 3: sedanList.add(new Sedan(name));
            break;
          }
        }
        break;
        case 2: {
          System.out.println("====================");
          System.out.println("Jeep");
          System.out.println("====================");
          for (Car c : jeepList) {
            System.out.println(c);
          }
          System.out.println("====================");
          System.out.println("SUV");
          System.out.println("====================");
          for (Car c : suvList) {
            System.out.println(c);
          }
          System.out.println("====================");
          System.out.println("Sedan");
          System.out.println("====================");
          for (Car c : sedanList) {
            System.out.println(c);
          }
          scanner.nextLine();
        }
        break;
      }
    }
  }


  public static void main(String[] args) {
    new Main().run();
  }
}
