public class Greet {
  public static void main(String[] args) {
    String al = "Greenfox";
    String fullGreeting = greet(al);
    System.out.println(fullGreeting);
  }
  public static String greet(String a){
    String hello;
    hello = "Greetings dear, " + a;
    return hello;
  }
}
