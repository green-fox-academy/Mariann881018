import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  Pirate captain;
  int crewNumber;
  int noOfPassedOut;
  boolean winner = false;
  int noOfAlive;
  int score;

  public Ship(){
    crew = new ArrayList<>();
  }

  public void fillShip(){
    crew.add(captain);
    int n = (int) (Math.random()* 20 + 1);
    for (int i = 0; i < n; i++){
      crew.add(new Pirate());
      crewNumber++;
    }
  }

  public void getNoOfPassedOut(){
    for (Pirate pirates : crew){
      if (pirates.passedOut == true){
        noOfPassedOut++;
      }
    }
  }

  public int getScore() {

    for (Pirate pirates : crew){
      if (pirates.isAlive == true){
        noOfAlive++;
      }
    }
    this.score = noOfAlive-captain.rumCounter;
    return this.score;
  }

  public void getInfo(){
    System.out.println("The captain of this ship is " + captain.name + ".\n"
    + captain.name + " has drunk " + captain.rumCounter + " rums.\n"
    + captain.name + captain.getStatus() + ", and" + captain.info() + ".\n"
    + "The ship has " + crewNumber + " pirates, and " + noOfPassedOut + " of them are passed out.");
  }

  public void battle(Ship othership){
    if (this.score > othership.score){
      this.winner = true;
    } else {
      othership.winner = true;
    }

    if (!winner){
      
    }
  }
}
/*
Ships should have a method to battle other ships: ship.battle(otherShip) -
should return true if the actual ship (this) wins
the ship should win if its calculated score is higher
- calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
The loser crew has a random number of losses (deaths). - The winner captain and crew has a party, including a random number of rum :)

 */
