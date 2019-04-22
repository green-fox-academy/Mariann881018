import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {
  ArrayList<Integer> dice = new ArrayList<>();
  public List<Integer> roll() {
    for (int i = 0; i < 6; i++) {
      dice.add((int) (Math.random() * 6) + 1);
    }
    return dice;
  }

  public List<Integer> getCurrent() {
    return dice;
  }

  public int getCurrent(int i) {
    return dice.get(i);
  }

  public void reroll() {
    for (int i = 0; i < dice.size(); i++) {
      dice.set(i, (int) (Math.random() * 6) + 1);
    }
  }

  public void reroll(int k) {
    dice.set(k, (int) (Math.random() * 6) + 1);
  }

  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();
    System.out.println(diceSet.getCurrent());
    System.out.println(diceSet.roll());
    System.out.println(diceSet.getCurrent());
    System.out.println(diceSet.getCurrent(5));
    diceSet.reroll();
    System.out.println(diceSet.getCurrent());
    diceSet.reroll(4);
    System.out.println(diceSet.getCurrent());
    Integer[] ids = {6, 6, 6, 6, 6, 6};
    ArrayList<Integer> goal = new ArrayList<Integer>(ids.length);

    diceSet.roll();
    for (int z: ids){
      goal.add(z);
    }
    System.out.println("Goal: " + goal);

    do {
      diceSet.reroll() ;
    } while (diceSet.getCurrent().equals(goal));
    System.out.println(diceSet.getCurrent());
  }
}

// goal: [6, 6, 6, 6, 6, 6]
// diceSet.getCurrent() = {6,6,6,6,6,6}
/*
    You have a `DiceSet` class which has a list for 6 dice
    You can roll all of them with roll()
    Check the current rolled numbers with getCurrent()
    You can reroll with reroll()
    Your task is to roll the dice until all of the dice are 6
 */