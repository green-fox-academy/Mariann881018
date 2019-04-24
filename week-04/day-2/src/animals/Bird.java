package animals;

public class Bird extends Animal {

  public Bird(String name) {
    this.setName(name);
  }

  public String breed() {
    String s = "laying eggs.";
    return s;
  }
}
