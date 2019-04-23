public class F35 extends Aircraft {
  private int maxAmmo;

  public F35() {
    this.maxAmmo = 12;
    setBaseDamage(50);
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public F35(String type, int ammo, int baseDamage) {
    super(type, ammo, baseDamage);
    this.maxAmmo = maxAmmo;
  }


}
