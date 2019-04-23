public class Person {
  private String name;
  private int age;
  private String gender;

  public Person(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";

  }
  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }


  public int getAge() {
    return age;
  }


  public String getGender() {
    return gender;
  }


  void introduce(){
    System.out.print("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " ");
  }

  void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }
}

/*
Create a Person class with the following fields:
 - name: the name of the person
 - age: the age of the person (whole number)
 - gender: the gender of the person (male / female)
Constructors:
 - Person(name, age, gender)
 - Person(): sets name to Jane Doe, age to 30, gender to female
Methods:
 - introduce(): prints out "Hi, I'm name, a age year old gender."
 - getGoal(): prints out "My goal is: Live for the moment!"

 */