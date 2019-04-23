public class Mentor extends Person{
  String level;

  public Mentor(){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = "intermediate";

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
    System.out.print(this.level + " mentor. \n");
  }
}

/*
fields:
 - level: the level of the mentor (junior / intermediate / senior)
Constructors:
 - Mentor(name, age, gender, level)
 - Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
methods:
 - getGoal(): prints out "Educate brilliant junior software developers."
 - introduce(): "Hi, I'm name, a age year old gender level mentor."

 */