package Flyable;

import animals.Animal;

public class Bird extends Animal implements Flyable{

  public Bird(String name) {
    this.setName(name);
  }

  public String breed() {
    String s = "laying eggs.";
    return s;
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
