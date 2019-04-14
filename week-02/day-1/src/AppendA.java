public class AppendA {

  public static void main(String[] args) {

    String[] animals = {"koal", "pand", "zebr"};

    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";  // adds an 'a' to the end of i-th element of the animals list
    }

    for (String newString : animals) {  //goe through the elements of animals list and stores them in a new string
      System.out.println(newString);
    }
  }
}

// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
