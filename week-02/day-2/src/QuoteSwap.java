import java.util.*;
public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap(). // Also, print the sentence to the output with spaces in between.
    // Expected output: "What I cannot create I do not understand."

    System.out.println(quoteSwap(list));

  }

  public static ArrayList<String> quoteSwap(ArrayList<String> origQuote){
    Collections.swap(origQuote,2,5);
    return origQuote;
  }

}
/*
"What I cannot create, I do not understand"
  public static ArrayList<String> makingMatches(ArrayList<String> girlsList, ArrayList<String> boysList){
 */