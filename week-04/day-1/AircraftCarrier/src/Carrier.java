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
    for (Aircraft aircraft : aircrafts) {
      allCraftDamage += aircraft.getAllDamage();
    }
    return allCraftDamage;
  }

  public void getStatus(){
    if (healthPoints == 0){
      System.out.println("It's dead Jim");
    } else {
      System.out.println("HP: " + this.healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: "
              + this.storeOfAmmo + ", Total damage: " + totalDamage() + "\n"
      + "Aircrafts:");
      for (Aircraft aircraft : aircrafts){
        aircraft.getStatus();
      }
    }
  }
}