import java.sql.SQLOutput;
import java.util.Scanner;
public class Cuboid {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Give me the length, width and height of the cuboid(cm):");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    int surfArea = 2*a + 2*b + 2*c;
    int volume = a * b * c;

    System.out.println("Surface Area: " + surfArea + " cm2");
    System.out.println("Volume: " + volume + " cm3");
  }
}
