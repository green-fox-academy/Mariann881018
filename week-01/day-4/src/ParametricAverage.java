import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
      Scanner inputNo = new Scanner(System.in);
      System.out.println("Give me a number:");
      int a = inputNo.nextInt();
      int sum = 0;



      for (int i = 1; i <= a; i++) {
        System.out.println("Give me another number:");
        int numbersToAdd = inputNo.nextInt();
        sum = sum + numbersToAdd;
      }

      double average = sum / a;

      System.out.println("Sum: " + sum );
      System.out.println("Average: " + (int) (average));
    }
  }


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these integers like:
// Sum: 22, Average: 4.4



