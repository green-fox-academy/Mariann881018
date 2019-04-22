public class AppendA {

  public static void main(String[] args) {
    String[] animals = {"koal", "pand", "zebr"};
    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";
    }

    for (String newString : animals) {
      System.out.println(newString);
    }
  }
}