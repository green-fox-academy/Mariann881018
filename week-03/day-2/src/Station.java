public class Station {
  int gasAmount;

  public Station(int gasAmount){
    this.gasAmount = gasAmount;

  }

  public void refill(Car car){
    this.gasAmount -= (car.capacity);
    car.gasAmount += gasAmount;
    System.out.println("Car refilled");
  }


}
/*
gasAmount = gasAmount - carCapacity
cars.gasAmount


Create Station and Car classes
Station
    gasAmount
    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
   gasAmount
   capacity
create constructor for Car where:
  initialize gasAmount -> 0
  initialize capacity -> 100

public class Car {
  int gasAmount = 0;
  int capacity = 100;

public Car(int gasAmount,int capacity){
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

}
 */