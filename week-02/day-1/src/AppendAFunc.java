public class AppendAFunc {
  public static void main(String[] args) {
    String typo = "Chinchill";
    String runIt = appendAFunc(typo);
    System.out.println(runIt);
  }

    public static String appendAFunc(String a){
      String makeIt;
      makeIt = a + "a";
      return makeIt;
    }
  }


