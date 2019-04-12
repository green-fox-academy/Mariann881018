import java.util.Scanner;
public class PartyIndicator {
  public static void main(String[] args) {

    int numGirls;
    int numBoys;

    System.out.println("Give me the number of girls, than the number of boys:");
    Scanner input = new Scanner(System.in);

    numGirls = input.nextInt();
    numBoys = input.nextInt();
    int sum = numBoys + numGirls;

    if (numBoys == numGirls && sum >= 20) {
      System.out.println("The party is excellent!");
    } else if (numGirls == 0) {
      System.out.println("Sausage party");
    } else if (sum >= 20 && (numBoys!=numGirls)) {
      System.out.println("Quite cool party!");
    } else if (sum < 20) {
      System.out.println("Average party...");
    } else if (numGirls == 0){
      System.out.println("Sausage party");
    }
  }
}
