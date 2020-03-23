package org.learn.customers;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private static List<String> existingId = new ArrayList<>();
  private final String id;
  private String name;

  public Customer(String name) {
    setName(name);

    String generatedId = "";

    do {
      generatedId = String.format("%03d", (int)Math.floor(Math.random() * 301));
    } while ( isIdExists(generatedId) ); // ngulang terus kalo misal udah ada di list existingId
    // kalo gaada berenti

    existingId.add(generatedId);

    this.id = generatedId;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Customer{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      '}';
  }

  public static Boolean isIdExists(String id) {
    return existingId.contains(id);
  }
}
