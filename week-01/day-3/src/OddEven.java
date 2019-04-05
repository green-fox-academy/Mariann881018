import  java.util.Scanner;
public class OddEven {
  public static void main(String[] args) {
    int number;

    System.out.println("Please give me a number:");
    Scanner input = new Scanner(System.in);
    number = input.nextInt();

    if (number == 0) {
      System.out.println("0 is neither even, nor odd");
    }
   else if ((number % 2)==0)
      System.out.println("it is even");
   else
      System.out.println("it is odd");

  }
}
   /* Write a program that reads a number from the standard input,
   Then prints "Odd" if the number is odd, or "Even" if it is even.
   */