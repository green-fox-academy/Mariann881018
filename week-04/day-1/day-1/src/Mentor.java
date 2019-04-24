public class Mentor extends Person{
  private String level;

  public Mentor(){
    this.level = "intermediate";
  }


  public String getLevel() {
    return level;
  }

  public Mentor(String name, int age, String gender, String level){
    super(name,age,gender);
    this.level = level;
  }

  @Override
  void getGoal(){
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  @Override
  void introduce(){
    super.introduce();
    System.out.print(this.getLevel() + " mentor. \n");
  }
}
