import java.util.ArrayList;
import java.util.List;

public class Carrier extends Aircraft{
  private List<Aircraft> aircrafts = new ArrayList<>();
  private int storeOfAmmo;
  private int healthPoints;

  public Carrier(){
  }

  public Carrier(int storeOfAmmo, int healthPoints) {
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
        allNeeded += (aircraft.getMaxAmmo()-aircraft.getCurrentAmmo());
      }
    }
    if (storeOfAmmo < allNeeded){
      for (Aircraft aircraft : aircrafts){
        if (aircraft.isPriority()){
          aircraft.setCurrentAmmo(aircraft.getMaxAmmo());
        }
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

  public int totalDamage() {
    int allCraftDamage = 0;
    for (Aircraft aircraft : aircrafts) {
      allCraftDamage += (aircraft.getMaxAmmo()* aircraft.getBaseDamage());
    }
    return allCraftDamage;
  }

  public void getStatus(){
    if (healthPoints == 0){
      System.out.println("It's dead Jim");
    } else {
      System.out.println("HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: "
              + storeOfAmmo + ", Total damage: " + totalDamage() + "\n"
      + "Aircrafts:");
      for (Aircraft aircraft : aircrafts){
        aircraft.getStatus();
      }
    }
  }
}