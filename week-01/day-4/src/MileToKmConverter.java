import java.util.Scanner;
public class MileToKmConverter {
  public static void main(String[] args) {
    int kilometers;

    System.out.println("Please enter a distance in kilometers:");
    Scanner input = new Scanner(System.in);
    kilometers = input.nextInt();

    float miles = (float) (kilometers * 0.621);
    System.out.println("This is " + miles + " miles.");

    /*Write a program that asks for an integer that is a distance in kilometers,
      then it converts that value to miles and prints it
      miles = km * 0.621
    */
  }
}
