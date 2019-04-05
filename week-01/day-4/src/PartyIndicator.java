import java.util.Scanner;
public class PartyIndicator {
  public static void main(String[] args) {

    int numGirls;
    int numBoys;

    System.out.println("Give me the number of girls, than the number of boys:");
    Scanner inputOne = new Scanner(System.in);
    Scanner inputTwo = new Scanner(System.in);

    numGirls = inputOne.nextInt();
    numBoys = inputTwo.nextInt();
    int sum = numBoys + numGirls;
    int ratio = numGirls / numBoys;  // ratio not correct

    if (numBoys == numGirls && sum >= 20) {
      System.out.println("The party is excellent!");
    } else if (sum >= 20 && (ratio != 1)) {
      System.out.println("Quite cool party!");
    } else if (sum < 20) {
      System.out.println("Average party...");
    } else if (numGirls == 0){
      System.out.println("Sausage party");
    }
  }
}
