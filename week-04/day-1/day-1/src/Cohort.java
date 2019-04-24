import java.util.ArrayList;
import java.util.List;

public class Cohort {
  String name;
  List<Student> students;
  List<Mentor> mentors;


  public Cohort(String name){
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  void addStudent(Student student){
    students.add(student);
  }
  void addMentor(Mentor mentor){
    mentors.add(mentor);
  }

  void info() {
    System.out.println("The " + this.name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}

