public class Main {

  public static void main(String[] args) {

    Pirate jones = new Pirate();
    jones.name = "Jones";
    jones.alcoholLevel = 50;
    jones.rumCounter = 4;

    Pirate smith = new Pirate();
    smith.name = "Smith";
    smith.alcoholLevel = 30;
    smith.passedOut = true;

    Ship pearl = new Ship();
    pearl.captain = jones;
    pearl.crew.add(smith);
    pearl.fillShip();
    pearl.getInfo();
  }
}
