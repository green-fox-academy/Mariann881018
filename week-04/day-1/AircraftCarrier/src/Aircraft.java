public class Aircraft {
  private int ammo;
  private String type;
  private int baseDamage;
  private int allDamage;
  private boolean isPrio;

  public Aircraft(){   //All aircrafts should be created with an empty ammo storage
    this.ammo = 0;
  }

  public Aircraft(String type, int ammo, int baseDamage){
    this.type = type;
    this.ammo = ammo;
    this.baseDamage = baseDamage;
    this.allDamage = baseDamage * ammo;
  }

  public int getAmmo() {
    return ammo;
  }

  public String getType() {
    return this.type;
  }

  public int getBaseDamage() {
    return this.baseDamage;
  }

  public int getAllDamage() {
    return this.allDamage;
  }

  void getStatus(){
    System.out.println("Type: " + getType() + ", Ammo: " + getAmmo() + ", Base damage: "
            + getBaseDamage() + ", All damage: " + getAllDamage());
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

   public int fight(){
    int dealtDamage = getAmmo() * getBaseDamage();
    setAmmo(0);
    return dealtDamage;
  }

  public int refill(int a){
    int remaining = 0;

    remaining = a - getAmmo();
    return remaining;
  }
/*
refill
  It should take a number as parameter and subtract as much ammo as possible
  It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter
     or the max ammo of the aircraft)
  It should return the remaining ammo
  Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288

 */


  public boolean isPriority(){
    return this.isPrio;
  }
}

