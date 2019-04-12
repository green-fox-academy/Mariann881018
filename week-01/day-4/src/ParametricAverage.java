import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
      System.out.println("Give me a number:");
      Scanner num = new Scanner(System.in);
      int a = num.nextInt();


      for (int i = 1; i <= a; i++) {
        System.out.println("Give me another number:");
      }
       a = num.nextInt();
       a += num.nextInt();




    System.out.println("Sum: " + sum );
    System.out.println("Average: " + average);
    }
  }


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these integers like:
// Sum: 22, Average: 4.4



