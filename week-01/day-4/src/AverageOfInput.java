import java.util.Scanner;
public class AverageOfInput {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    double i;
    double sum = 0;
    int count = 0;

    System.out.println("Please give me 5 numbers:");
    while (input.hasNextDouble()){

      i = input.nextDouble();
      sum = sum = i;
      count++;

    }

    System.out.println("Sum: " + sum);
    System.out.println("Average: "+ sum / (count));
      }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
