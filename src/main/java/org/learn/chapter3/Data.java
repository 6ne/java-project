package org.learn.chapter3;

public class Data {
  private static Integer incrementalNo = 0;
  private Integer no;
  private String name;
  private String pass;
  private String phone;

  public Data() {
    no = ++incrementalNo;
  }

  public Integer getNo() {
    return no;
  }

  public void setNo(Integer no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return String.format("| %02d | %-15s | %-15s | %-15s |", no, name, pass, phone);
  }
}
