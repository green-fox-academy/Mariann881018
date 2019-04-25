package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;


  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }

  public abstract String sound();
}
