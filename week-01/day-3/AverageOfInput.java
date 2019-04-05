import  java.util.Scanner;
public class AverageOfInput{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please give me 5 numbers:");
    int numOne = scan.nextInt();
    int numTwo = scan.nextInt();
    int numThree = scan.nextInt();
    int numFour = scan.nextInt();
    int numFive = scan.nextInt();

    int sum = numOne + numTwo + numThree + numFour + numFive;
    float average = sum /5;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

  }

}
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
// Sum: 22, Average: 4.4
