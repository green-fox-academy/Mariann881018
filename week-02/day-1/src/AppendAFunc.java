public class AppendAFunc {
  public static void main(String[] args) {
    String typo = "Chinchill";
    String runIt = appendAFunc(typo);
    System.out.println(runIt);
  }

    public static String appendAFunc(String a){
      String makeIt = a + "a";
      return makeIt;
    }
  }

/*
// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
 */
