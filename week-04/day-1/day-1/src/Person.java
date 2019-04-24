
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
