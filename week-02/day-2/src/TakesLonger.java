public class TakesLonger {
  public static void main(String... args){

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String missingPart = "always takes longer than ";
    String firstPart = quote.substring(0,quote.indexOf("you"));
    String lastPart = quote.substring(quote.indexOf("y"), quote.lastIndexOf("."));
    System.out.println(firstPart + missingPart + lastPart);
  }
}