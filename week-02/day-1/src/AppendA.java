public class AppendA {

  public static void main(String[] args) {

    String[] animals = {"koal", "pand", "zebr"};

    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";  // adds an a to the end of each element
    }

    for (String newString : animals) {
      System.out.println(newString);
    }
  }
}

// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

/* for (int i : arr) {
   System.out.println(i);

 */
