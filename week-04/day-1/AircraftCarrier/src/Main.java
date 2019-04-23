public class Main {
  public static void main(String[] args) {

    F16 myf16 = new F16();
    myf16.setCurrentAmmo(4);

    F35 myf35 = new F35();
    myf35.setCurrentAmmo(10);
    myf16.getStatus();
    myf35.getStatus();
    System.out.println();

    Carrier boss = new Carrier(2999,5000);
    boss.addAircraft(myf16);
    boss.addAircraft(myf35);
   // boss.getStatus();
    System.out.println(boss.totalDamage());

  }
}
