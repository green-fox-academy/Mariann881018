public class Student extends Person{
  private String prevOrg;
  private int skippedDays;

  public Student(String name, int age, String gender, String prevOrg){
    super(name, age, gender);
    this.prevOrg = prevOrg;
  }

  public Student(){
    this.prevOrg = "The School of Life";
    this.skippedDays = 0;
  }

  void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }

  public String getPrevOrg() {
    return prevOrg;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  @Override
  void introduce(){
    super.introduce();
    System.out.print(" from " + this.getPrevOrg() + ", who skipped " + this.getSkippedDays() + " days from the course already. \n");
  }

  @Override
  void getGoal(){
    System.out.println("My goal is: Be a junior software developer.");
  }
}
