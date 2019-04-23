public class F16 extends Aircraft{
  private int maxAmmo;

  public F16() {
    this.maxAmmo = 8;
    setBaseDamage(30);
  }

  public F16(String type, int ammo, int baseDamage, int maxAmmo) {
    super(type, ammo, baseDamage);
    this.maxAmmo = maxAmmo;
  }


}
