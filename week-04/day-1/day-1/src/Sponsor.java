public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(){

  }

  public Sponsor(String name, int age, String gender, String company){
    super(name,age,gender);
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  void getGoal(){
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  @Override
  void introduce(){
    super.introduce();
    System.out.print( "who represents " + this.company + " and hired " + this.hiredStudents + " students so far. \n");
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