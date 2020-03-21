package org.learn.lastChapter.runnables;

public class Data implements Runnable {
  private String name;

  public Data(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0 ; i < 5 ; ++i) {
      System.out.println(name + " iterate: " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
