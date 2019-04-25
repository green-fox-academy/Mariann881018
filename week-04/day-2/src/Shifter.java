import java.util.stream.IntStream;

public class Shifter implements CharSequence{
  String s;
  int shift;

  public Shifter() {
  }

  public Shifter(String s, int a){
  }

  public int length() {
    return s.length();
  }

  public char charAt(int index) {
    char[] charArray = s.toCharArray();
    if (index > this.length() - 1) {
      throw new IndexOutOfBoundsException();
    }
    if (index + this.shift < this.length()) {
      return charArray[index + this.shift];
    }
    return charArray[index + this.shift - this.length()];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}