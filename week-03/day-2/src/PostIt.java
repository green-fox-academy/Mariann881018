public class PostIt {
  String backgroundcolor;
  String textOnIt;
  String textColor;

  public PostIt(String backgroundcolor, String textOnIt, String textColor){
    this.backgroundcolor = backgroundcolor;
    this.textOnIt = textOnIt;
    this.textColor = textColor;
  }

  public void printit() {
    System.out.println("backgroundcolor is " + backgroundcolor);
    System.out.println("text on it is " + textOnIt);
    System.out.println("text color is " + textColor);
  }
}
