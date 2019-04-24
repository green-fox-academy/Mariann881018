package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(){
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
    name = "Electric Guitar";

  }

  public String sound() {
    String itsSound = "Twang";
    return itsSound;
  }

}