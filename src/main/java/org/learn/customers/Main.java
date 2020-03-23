package org.learn.customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Customer> customerList = new ArrayList<>();
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
        Customer customer = new Customer(name);

        customerList.add(customer);
      } else if (menu == 2) {
        for(Customer c : customerList) {
          System.out.println(c);
        }
      } else if (menu == 3) {
        for(Customer c : customerList) {
          System.out.println(c);
        }

        String id = "";

        while(!Customer.isIdExists(id)) { // ulang kalo id nya gaada
          System.out.print("input id: ");
          id = scan.nextLine();
        }

        int idx = -1;

        for(int i = 0 ; i < customerList.size() ; ++i) {
          Customer c = customerList.get(i);

          if (c.getId().equals(id)) {
            idx = i;
            break;
          }
        }

        customerList.remove(idx);

      }

    }
  }
}
