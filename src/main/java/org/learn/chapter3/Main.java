package org.learn.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Data> dataList = new ArrayList<>();

    int menu = -1;
    while( menu != 4 ) {
      for(int i = 0 ; i < 25 ; ++i) System.out.println();

      System.out.println("1. Input Data");
      System.out.println("2. Show Data");
      System.out.println("3. Delete Data");
      System.out.println("4. Exit");

      do {
        try {
          System.out.print("Your Choice: ");
          menu = scanner.nextInt();
        } catch (Exception e) {
          menu = -1;
        } finally {
          scanner.nextLine();
        }
      } while (menu < 1 || menu > 4);

      switch (menu) {
        case 1: {
          String input = "";
          Data data = new Data();

          System.out.print("Name: ");
          input = scanner.nextLine();
          data.setName(input);

          System.out.print("Pass: ");
          input = scanner.nextLine();
          data.setPass(input);

          System.out.print("Phone: ");
          input = scanner.nextLine();
          data.setPhone(input);

          dataList.add(data);
          System.out.println("New Data is added");
        }
        break;
        case 2: {
          if (dataList.isEmpty()) {
            System.out.println("No Data Exists!");
            scanner.nextLine();
            break;
          }
          System.out.println("============================================================");
          System.out.printf("| %-2s | %-15s | %-15s | %-15s |\n", "No", "Name", "Pass", "Phone");
          System.out.println("============================================================");

          for(Data data: dataList) {
            System.out.println(data);
          }

          System.out.println("============================================================");
          scanner.nextLine();
        }
        break;
        case 3: {
          if (dataList.isEmpty()) {
            System.out.println("No Data Exists!");
            scanner.nextLine();
            break;
          }
          System.out.println("============================================================");
          System.out.printf("| %-2s | %-15s | %-15s | %-15s |\n", "No", "Name", "Pass", "Phone");
          System.out.println("============================================================");

          for(Data data: dataList) {
            System.out.println(data);
          }

          System.out.println("============================================================");

          System.out.print("Input data number to be deleted: ");
          int target = -1;
          do {
            try {
              System.out.print("Your Choice: ");
              target = scanner.nextInt();
            } catch (Exception e) {
              target = -1;
            } finally {
              scanner.nextLine();
            }
          } while (target < 1 || menu > dataList.size());

          --target;

          dataList.remove(target);
          System.out.println("Data is removed");
        }
        break;
      }
    }
  }
}
