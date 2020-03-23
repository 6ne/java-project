package org.learn.customers;

public class CustomerWithMap {
  private final String id;
  private String name;

  public CustomerWithMap(String id, String name) {
    this.id = id;
    this.name = name;
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
    return "CustomerWithMap{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      '}';
  }
}
