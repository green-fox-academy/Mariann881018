import java.util.Scanner;
public class PrintBigger {
  public static void main(String[] args) {
    int numOne;
    int numTwo;

    System.out.println("Give me 2 numbers");

    Scanner inputOne = new Scanner(System.in);
    Scanner inputTwo = new Scanner(System.in);
    numOne = inputOne.nextInt();
    numTwo = inputTwo.nextInt();

    if (numOne > numTwo){
      System.out.println("The bigger is " + numOne);
    } else if (numTwo > numOne){
      System.out.println("The bigger is " + numTwo);
    }
    else {
      System.out.println("They are equal.");
    }
  }
}
// Write a program that asks for two numbers and prints the bigger one