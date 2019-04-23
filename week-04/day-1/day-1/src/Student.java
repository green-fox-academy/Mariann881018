public class Student extends Person{
  String prevOrg;
  int skippedDays;

  public Student(String name, int age, String gender, String prevOrg){
    super(name, age, gender);
    this.prevOrg = prevOrg;
    int skippedDays = 0;
  }

  public Student(){
    this.prevOrg = "The School of Life";
    this.skippedDays = 0;
  }

  void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }

  @Override
  void introduce(){
    super.introduce();
    System.out.print(" from " + this.prevOrg + ", who skipped " + this.skippedDays + " days from the course already. \n");
  }

  @Override
  void getGoal(){
    System.out.println("My goal is: Be a junior software developer.");
  }
}

/*
Create a Student class that has the same fields and methods as the Person class, and has the following additional
fields:
 - previousOrganization: the name of the student’s previous company / school
 - skippedDays: the number of days skipped from the course

The Student class has the following constructors:
 - Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
  Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0

methods:
 - getGoal(): prints out "Be a junior software developer."
 - introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
 - skipDays(numberOfDays): increases skippedDays by numberOfDays

 */