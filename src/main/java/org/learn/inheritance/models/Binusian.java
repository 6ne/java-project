package org.learn.inheritance.models;

import org.learn.inheritance.enums.BinusianType;

// binusian should be abstract, because we can specify a binusian without any attribute
// you cannot create an object from abstract class because it's too abstract!
public abstract class Binusian {

  // static means the attribute/method is owned by the class not the object
  // as you run the program, you will realized that counter is incrementing everytime you create the object
  private static int counter = 0;

  // final means constant, once you set the attribute, you cannot re-set, that's why it has no setterMethod
  private final String id;
  private String name;

  // this is how we use Enum
  private BinusianType type;

  // why Binusian need a constructor even though we cannot create the object from abstract class?
  // constructor defines how we create the object even from those who inherited it
  public Binusian(String name, BinusianType type) {
    this.type = type;
    setName(name);
    id = String.format("BN%09d", ++counter);
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

  public BinusianType getType() {
    return type;
  }

  public void setType(BinusianType type) {
    this.type = type;
  }
}
