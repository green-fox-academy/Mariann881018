import java.util.Scanner;
public class Doubling {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number, I will tell you its doubled value:");
    int baseNum = input.nextInt();
    int result = doubling(baseNum);
    System.out.println(result);
  }

  public static int doubling(int n1){
    int d;
    d = n1*2;
    return d;
  }
}
