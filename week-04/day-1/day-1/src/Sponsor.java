public class Sponsor extends Person implements Cloneable {
  private String company;
  private int hiredStudents;

  public Sponsor(){
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company){
    super(name,age,gender);
    this.company = company;
  }

  public String getCompany() {
    return company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  @Override
  void getGoal(){
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  @Override
  void introduce(){
    super.introduce();
    System.out.print( "who represents " + this.getCompany() + " and hired " + this.getHiredStudents() + " students so far. \n");
  }

  void hire(){
    hiredStudents++;
  }



}


