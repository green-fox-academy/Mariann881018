public class Domino implements Comparable,Printable {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  @Override
  public void printAllFields() {
  }
}

/*
  @Override
  public int compareTo(Domino domino) {
    return toString().compareTo();
  }

 */
