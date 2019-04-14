import java.util.*;
public class PersonalFinance<cheapest> {
  public static void main(String[] args) {
    List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
    System.out.println("Total spending: " + totalspend(expenses));
    System.out.println("Greatest expense: " + greatestExpense(expenses));
    System.out.println("Cheapest expense: " + cheapestExpense(expenses));
    System.out.println("Average of expenses: " + averageExpense(expenses));
  }

  public static int totalspend(List<Integer> expenseList) {
    int totalSpent = 0;
    for (int i = 0; i < expenseList.size(); i++) {
      totalSpent += expenseList.get(i);
    }
    return totalSpent;
  }

  public static int greatestExpense(List<Integer> expenseList) {
    int greatest = 0;
    for (int i = 0; i < expenseList.size(); i++) {
      if (greatest < expenseList.get(i)) {
        greatest = expenseList.get(i);
      }
    }
    return greatest;
  }

  public static int cheapestExpense(List<Integer> expenseList) {
    int cheapest = Collections.min(expenseList);
    return cheapest;
  }

  public static int averageExpense(List<Integer> expenseList) {
    int average = totalspend(expenseList)/ expenseList.size();
    return average;
    }
  }

//We are going to represent our expenses in a list containing integers.
//Create a list with the following items: 500, 1000, 1250, 175, 800 and 120
//Create an application which solves the following problems.
//How much did we spend?
//Which was our greatest expense?
//Which was our cheapest spending?
//What was the average amount of our spending?

//Collections.sort
// import java.util.Collections;