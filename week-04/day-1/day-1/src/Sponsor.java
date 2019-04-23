public class Sponsor extends Person {
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

/*
fields:
 - company: name of the company
 - hiredStudents: number of students hired
Constructors:
 - Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
 - Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
method:
 - introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
 - hire(): increase hiredStudents by 1
  getGoal(): prints out "Hire brilliant junior software developers."

 */