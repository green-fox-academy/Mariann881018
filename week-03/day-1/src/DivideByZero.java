import java.util.Scanner;
public class DivideByZero {

  public static void main(String[] args) {
// Create a function that takes a number and divides ten with it, and prints the result.
// It should print "fail" if the parameter is 0
    Scanner inputNum = new Scanner(System.in);
    System.out.println("Please enter a number:");

    int a = inputNum.nextInt();
    divideTen(a);
  }

  public static void divideTen (int n){   // we need void as it does not return int/String....
    try {
      int result = 10/n;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    }
  }
}

/*
public class ErrorHandling {
  public static void main(String[] args) {

    try { // Prevents the program breaking when attempting dividing by zero
      int result = 12 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
    }
  }
}
 */