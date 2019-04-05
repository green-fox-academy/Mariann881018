import java.util.Scanner;
public class HelloUser {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Hi! What's your name?");
    String name = scan.next();
    System.out.println("Hello " + name + "!");

  }

}