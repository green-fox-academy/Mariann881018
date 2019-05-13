public class Anagram {

  public static void main(String[] args) {

  }

  public boolean anagram(String string1, String string2){
    char[] temp = string1.toCharArray();
    StringBuilder check = new StringBuilder(string2);
    check.reverse();
    char[] temp2 = check.toString().toCharArray();
    for (int i = 0; i < temp.length; i++) {
      if (temp[i] != temp2[i]){
        return false;
      }
    }
    return true;
  }
}