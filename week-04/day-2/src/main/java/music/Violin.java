package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    name = "Violin";
    numberOfStrings = 4;
  }

  public Violin(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String sound() {
    String itsSound = "Screech";
    return itsSound;
  }

}
