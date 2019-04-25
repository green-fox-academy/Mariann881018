public class Gnirts implements CharSequence{
  String s;

  public Gnirts(String s) {
    this.s = s;
  }

  public int length() {
    return s.length();
  }

  public char charAt(int index) {
    char[] charArray = s.toCharArray();
    return charArray[s.length() - 1 - index];
  }

  public CharSequence subSequence(int start, int end) {
    return null;
    }
  }

