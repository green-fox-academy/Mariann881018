package Flyable;

public class Helicopter extends Vehicle implements Flyable{

  public Helicopter(String color, String name, String brand) {
    super(color, name, brand);
  }

  public void land() {
  }

  public void fly() {
  }

  public void takeOff() {
  }
}

/*
Extend Flyable.Helicopter class from Flyable.Vehicle
implement your Flyable.Flyable interface
 */