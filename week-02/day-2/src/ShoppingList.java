import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> shoppingList = Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken");
    System.out.println("Do we have milk on the list? " + checkMilk(shoppingList));
    System.out.println("Do we have banana on the list? " + checkBanana(shoppingList));

  }
  public static boolean checkMilk(List<String> listToCheck) {
    if (listToCheck.contains("milk")) {
      System.out.println("Milk is on the list");
      return true;
    } else
      return false;
  }
  public static boolean checkBanana(List<String> listToCheck) {
    if (listToCheck.contains("banana")) {
      System.out.println("Banana is on the list");
      return true;
    } else
      return false;
  }
}

/*
  We are going to represent a shopping list in a list containing strings.
        Create a list with the following items: Eggs, milk, fish, apples, bread and chicken
        Create an application which solves the following problems.
        Do we have milk on the list?
        Do we have bananas on the list?

 */