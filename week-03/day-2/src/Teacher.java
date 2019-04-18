public class Teacher {
  String nameT;

  public Teacher(String nameT){
    this.nameT = nameT;
  }

  public void teach(Student student){
    System.out.println("Listen to me, " + student.nameS + " I'll explain it");
  }

  public void answer(){
    System.out.println("The solution is....");
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