import javax.sound.midi.Soundbank;

public class PetrolStation {
  public static void main(String[] args) {
    Car myCar = new Car();
    Station mol = new Station(1000);
    System.out.println("mycar's current capacity: " + myCar.capacity + ", gas amount: " + myCar.gasAmount);
    mol.refill(myCar);
    System.out.println("mycar's new capacity: " + myCar.capacity + ", gas amount: " + myCar.gasAmount);
    System.out.println("station's remaining gas amount: " + mol.gasAmount);
  }
}

/*
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
 */