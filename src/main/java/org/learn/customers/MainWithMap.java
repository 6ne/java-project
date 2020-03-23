package org.learn.customers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainWithMap {

  public static void main(String[] args) {
    Map<String, CustomerWithMap> customerMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    int menu = 0;

    while(menu != 4) {
      System.out.println("1. input");
      System.out.println("2. view");
      System.out.println("3. delete");
      System.out.println("4. exit");
      System.out.print("input: ");

      menu = scan.nextInt();
      scan.nextLine();


      if (menu == 1) {
        System.out.print("input name: ");
        String name = scan.nextLine();

        String generatedId = "";

        do {
          generatedId = "CU" + String.format("%03d", (int)Math.floor(Math.random() * 301));
        } while ( customerMap.containsKey(generatedId) ); // ngulang terus kalo misal udah ada di list existingId

        CustomerWithMap customer = new CustomerWithMap(generatedId, name);
        customerMap.put(generatedId, customer); // put ke map

      } else if (menu == 2) {
        for(CustomerWithMap c : customerMap.values()) {
          System.out.println(c);
        }
      } else if (menu == 3) {
        for(CustomerWithMap c : customerMap.values()) {
          System.out.println(c);
        }

        String id = "";

        while(!customerMap.containsKey(id)) { // ulang kalo id nya gaada
          System.out.print("input id: ");
          id = scan.nextLine();
        }

        customerMap.remove(id);

      }

    }
  }
}
