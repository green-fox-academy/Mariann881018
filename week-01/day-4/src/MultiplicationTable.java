import java.util.Scanner;
public class MultiplicationTable {
  public static void main(String[] args) {

    System.out.println("Give me the number:");
    Scanner number = new Scanner(System.in);
    int num = number.nextInt();

    for (int a = 1; a <= 10; a++) {
      System.out.println(a + " * " + num + " = " + a * num);
    }
  }
}