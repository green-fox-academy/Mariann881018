import java.util.*;
public class TelephoneBook {
  public static void main(String[] args) {
    Map<String, String> phoneBook = new HashMap<>();
    phoneBook.put("William A. Lathan","405-709-1865");
    phoneBook.put("John K. Miller","402-247-8568");
    phoneBook.put("Hortensia E. Foster","606-481-6467");
    phoneBook.put("Amanda D. Newland","319-243-5613");
    phoneBook.put("Brooke P. Askew ","307-687-2982");

    System.out.println("John K. Miller's phone number is " + phoneBook.get("John K. Miller"));
    List keys = new ArrayList();
    keys.addAll(phoneBook.keySet());
    List values = new ArrayList();
    values.addAll(phoneBook.values());

    for ( int i = 0; i < values.size(); i++ ){
    if (values.get(i).equals("307-687-2982")){
      System.out.println("Phone number 307-687-2982 belongs to: " + keys.get(i));
    }
  }
    if (phoneBook.containsKey("Chris E. Myers")) {
      System.out.println("Chris E. Myers' phone number is " + phoneBook.get("Chris E. Myers"));
    } else
      System.out.println("We don't know Chris E. Myers' phone number");
  }
}


/*
We are going to represent our contacts in a map where the keys are strings and the values are going to be strings as well.
Create a map with the following key-value pairs.
Name (key)           Phone number (value)
William A. Lathan    405-709-1865
John K. Miller       402-247-8568
Hortensia E. Foster  606-481-6467
Amanda D. Newland    319-243-5613
Brooke P. Askew      307-687-2982
Create an application which solves the following problems:
What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number?
 */