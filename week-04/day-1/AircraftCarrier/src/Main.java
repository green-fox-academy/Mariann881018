public class Main {
  public static void main(String[] args) {

    Aircraft one = new Aircraft();
    one.setCurrentAmmo(4);
    one.setBaseDamage(30);
    one.setMaxAmmo(12);
    one.getStatus();
    one.fight();
    one.getStatus();
    one.refill(200);
    one.getStatus();

    F16 myf16 = new F16();
    myf16.setCurrentAmmo(10);
    myf16.getStatus();
    myf16.fight();
    myf16.getStatus();

  }
}
// Max, BASE