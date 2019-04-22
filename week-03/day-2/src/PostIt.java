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
  /*
 Create a PostIt class that has
a backgroundColor, a text on it, a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"
   */