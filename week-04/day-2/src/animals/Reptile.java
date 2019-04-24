package animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.setName(name);
  }

  public String breed() {
    String s = "laying eggs.";
    return s;
  }
}
