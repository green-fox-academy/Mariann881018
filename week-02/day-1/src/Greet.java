public class Greet {
  public static void main(String[] args) {
    String al = "Greenfox";
    String greeting = greet(al);
    System.out.println(greeting);
  }
  public static String greet(String a){
    String hello;
    hello = "Greetings dear, " + a;
    return hello;
  }

}


//  From now on, create the usual class wrapper and main method on your own.
// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`