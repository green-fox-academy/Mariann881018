import java.util.ArrayList;
import java.util.List;

public class Carrier extends Aircraft{
  private List<Aircraft> aircrafts;
  int storeOfAmmo;
  int healthPoints;

  public Carrier(){
  }

  public Carrier(int storeOfAmmo, int healthPoints) {
    this.aircrafts = new ArrayList<>();
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoints = healthPoints;
  }

  public void addAircraft(Aircraft aircraft){
    this.aircrafts.add(aircraft);
  }

  public void fill(){
    try {
      if (storeOfAmmo == 0){
        throw new Exception();
      }
    } catch (Exception ex){
      System.out.println("Carrier's store of ammo is empty");
    }

    int allNeeded = 0;
    for (Aircraft aircraft : aircrafts) {
      if (aircraft.getCurrentAmmo() < aircraft.getMaxAmmo()){
        allNeeded += aircraft.getMaxAmmo();
      }
    }
    storeOfAmmo -= allNeeded;
  }

  public void fight(Carrier otherCarrier){
    otherCarrier.healthPoints -= totalDamage();
    for (Aircraft aircraft : aircrafts){
      aircraft.fight();
    }
  }

  public int totalDamage(){   // aircraft.fight returns the allDamage of individual crafts
    int allCraftDamage = 0;
    for (int i = 0; i < aircrafts.size(); i++){
      allCraftDamage = aircrafts.get(i).fight();
    }
    return allCraftDamage;
  }

  public void getStatus(){
    if (healthPoints == 0){
      System.out.println("It's dead Jim");
    } else {
      System.out.println("HP: " + this.healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: "
              + this.storeOfAmmo + ", Total damage: " + totalDamage() + "\n"
      + "Aircrafts:\n");
      for (int i = 0; i < aircrafts.size(); i++){
        System.out.println();
      }
    }
  }
}

/*
Methods:
 - fill
    It should fill all the aircraft with ammo and subtracts the needed ammo from the ammo storage
    If there is not enough ammo then it should start to fill the aircraft is with priority first
    If there is no ammo when this method is called, it should throw an exception fight
    It should take another carrier as a reference parameter and fire all the ammo from the aircraft's to it, then subtracts all the damage from its health points

HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
Aircrafts:
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240

If the health points are 0 then it should return: It's dead Jim :(

 */