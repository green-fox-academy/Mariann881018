public class Sharpie {
  String color;
  float width;
  float inkAmount = 100f;

  public Sharpie() {
  }

  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
  }

  public void use(){
    this.inkAmount--;
  }

  public boolean isUsable(){
    if (this.inkAmount >= 0){
      return true;
    }
    return false;
  }
}
