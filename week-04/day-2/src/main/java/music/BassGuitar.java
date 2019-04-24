package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(){
    name = "Bass Guitar";
    numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    name = "Bass Guitar";
  }

  public String sound() {
    String itsSound = "Duum-duum-duum";
    return itsSound;
  }
}