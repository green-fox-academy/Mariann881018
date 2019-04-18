import java.util.Scanner;
public class AnimalsAndLegs {
  public static void main(String[] args) {
    int chicken;
    int pigs;
    System.out.println("Please enter how many chicken the farm has:");
    Scanner chickNum = new Scanner(System.in);
    chicken = chickNum.nextInt();

    System.out.println("Please enter how many pigs the farm has:");
    pigs = pigNum.nextInt();

    int allLegs = chicken * 2 + pigs * 4;

    System.out.println("They have " + allLegs + " legs in total.");

    /* Write a program that asks for two integers
    The first represents the number of chickens the farmer has
    The second represents the number of pigs owned by the farmer
    It should print how many legs all the animals have
     */
  }
}
