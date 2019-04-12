import java.util.Scanner;
public class GuessTheNumber {
  public static void main(String[] args) {
    int myNum;
    myNum = (int) (Math.random() * 9 + 1);

    Scanner input = new Scanner(System.in);
    int guess;

    do {
      System.out.println("Guess a number between 1 and 10: ");
      guess = input.nextInt();

      if (guess == myNum){
        System.out.println("You found the number: " + myNum);
      } else if (guess < myNum){
        System.out.println("The stored number is higher");
      } else if (guess > myNum){
        System.out.println("The stored number is lower");
      }
    } while (guess != myNum);
  }
}
