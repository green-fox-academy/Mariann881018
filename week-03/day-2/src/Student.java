public class Student {
  String nameS;

  public Student(String name){
    this.nameS = name;

  }
  public void learn(){
    System.out.println("I'm learning hard...");
  }

  public void question(Teacher teacher){
    System.out.println("Could you please explain this....?");
  }

}
/*
Create Student and Teacher classes
Student
    learn()
    question(teacher) -> calls the teachers answer method
Teacher
    teach(student) -> calls the students learn method
    answer()
 */