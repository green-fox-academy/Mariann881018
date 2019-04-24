package Flyable;

public abstract class Vehicle {

  public String color;
  public String name;
  public String brand;

  public Vehicle(String color, String name, String brand) {
    this.color = color;
    this.name = name;
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}

/*
Create an abstract Flyable.Vehicle class it should have at least 3 fields

 */