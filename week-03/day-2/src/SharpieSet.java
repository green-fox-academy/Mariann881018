import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  public void add(Sharpie newSharpie) {
    sharpies.add(newSharpie);
  }

  boolean isUsable(Sharpie newSharpie) {
    if (newSharpie.inkAmount > 0) {
    }
    return isUsable(newSharpie);
  }

  public int countUsable() {
    int count = 0;
    for (Sharpie newSharpie : sharpies) {
      if (isUsable(newSharpie)) {
        count++;
      }
    } return count;
  }
}


/*
Reuse your Sharpie class
Create SharpieSet class
  it contains a list of Sharpie
  countUsable() -> sharpie is usable if it has ink in it
  removeTrash() -> removes all unusable sharpies
 */