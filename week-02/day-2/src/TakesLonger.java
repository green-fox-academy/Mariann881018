public class TakesLonger {
  public static void main(String... args){

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String missingPart = "always takes longer than ";
    String firstPart = quote.substring(0,quote.indexOf("you"));
    String lastPart = quote.substring(quote.indexOf("y"), quote.lastIndexOf("."));
    System.out.println(firstPart + missingPart + lastPart);

    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    //System.out.println(missingPart);
  }
}
/*
firstPart: Hofstadter's Law: It
missingPart: always takes longer than
lastPart: you expect, even when you take into account Hofstadter's Law.
fullQuote: firstPart + missingPart + lastPart
 */

