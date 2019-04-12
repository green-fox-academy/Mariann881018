import java.util.Scanner;
public class CountFromTo {
  public static void main(String[] args) {
    System.out.println("Give me two numbers:");

    Scanner input = new Scanner(System.in);
    int numbOne = input.nextInt();
    int numbTwo = input.nextInt();

    if (numbOne >= numbTwo) {
      System.out.println("The second number should be bigger");
    } else {
      do {
        System.out.println(numbOne);
        numbOne++;
      } while (numbTwo >= numbOne);
    }
    }
  }
