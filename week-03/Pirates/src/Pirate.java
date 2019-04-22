
public class Pirate {
  String name;
  int alcoholLevel;
  int rumCounter;
  boolean isAlive = true;  // booleans' default = false
  boolean passedOut;

  public Pirate(){
    String name;
    int alcoholLevel;
  }

  public void drinkSomeRum(){
    if (this.isAlive && !passedOut) {
      alcoholLevel += 50;
      rumCounter++;
    } else if (isAlive && passedOut){
      System.out.println("He is already passed out ");
    } else if (!this.isAlive) {
      System.out.println("He is dead");
    }
  }

  public void howsItGoingMate(){
    if (this.rumCounter <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.passedOut = true;
    }
  }

   public void die(){
    this.isAlive = false;
    this.passedOut = true;
    System.out.println("He is dead.");
  }

  public void brawl(Pirate anotherPirate){
    double chance = (Math.random());

    if (anotherPirate.isAlive && !anotherPirate.passedOut){
      if (chance < 0.33){
        anotherPirate.isAlive = false;
        System.out.println(anotherPirate.name + " died");
      } else if (chance > 0.33 && chance < 0.66){
        this.isAlive = false;
        System.out.println(this.name + " died!");
      } else if (chance > 0.66){
        this.passedOut = true;
        anotherPirate.passedOut = true;
        System.out.println(this.name + " and " + anotherPirate.name + " are both passed out!");
      }
    } else {
      System.out.println(anotherPirate.name + " is not ready for a fight");
    }
  }

  public String getStatus(){
    String a = "";
    if (this.isAlive){
      a = " is alive";
      return a;
    } else {
      a = " is dead";
    } return a;
  }
  public String info(){
    String b = "";
    if (this.passedOut){
      b = " is passed out";
      return b;
    } else {
      b = " is not passed out";
    } return b;
  }
}

//Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//drinkSomeRum() - intoxicates the Pirate some
//howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:- 0 to 4 times, "Pour me anudder!"
//else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.

//die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//And... if you get that far...
//Add a parrot.
