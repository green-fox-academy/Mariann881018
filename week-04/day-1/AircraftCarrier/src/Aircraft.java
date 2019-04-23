public class Aircraft {
  private int currentAmmo;
  private int baseDamage;
  private int allDamage;
  private int maxAmmo;
  boolean priority;

  public Aircraft(){
    this.setCurrentAmmo(0); // All aircrafts should be created with an empty ammo storage
  }

  public int getCurrentAmmo() {
    return this.currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getAllDamage() {
    return allDamage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int fight(){
    int allDamage = getBaseDamage()*getCurrentAmmo();
    setCurrentAmmo(0);
    return allDamage;
  }

  public int refill(int number){
    int remainingAmmo = 0;
    int needed = getMaxAmmo() - getCurrentAmmo();
    if (needed < number) {
      remainingAmmo = number - needed;
      setCurrentAmmo(getCurrentAmmo()+ needed);
    } else {
      setCurrentAmmo(getCurrentAmmo()+ number);
      remainingAmmo = 0;
    }
    return remainingAmmo;
  }

  public String getType() {
    return this.getClass().getSimpleName();
  }

  public void getStatus(){
    System.out.println("Type: " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base Damage: " + getBaseDamage()
            + ", All Damage: " + this.fight());
  }

  public boolean isPriority(){
    return priority;
  }
}

/*
how to return class' name:
String className = this.getClass().getSimpleName();
 */

