public class Main {
  public static void main(String[] args) {

    Aircraft one = new Aircraft("F16",5,20);
    one.fight();
    one.getStatus();

    F35 myf35 = new F35();
    myf35.getStatus();
    System.out.println(myf35.getMaxAmmo());

  }
}
