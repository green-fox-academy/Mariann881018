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

/*
Create a Cohort class that has the following
Fields:
 - name: the name of the cohort
 - students: a list of Students
 - mentors: a list of Mentors
Constructors:
 - Cohort(name): beside the given parameter, it sets students and mentors as empty lists
Methods:
 - addStudent(Student): adds the given Student to students list
 - addMentor(Mentor): adds the given Mentor to mentors list
 - info(): prints out "The name cohort has students.size() students and mentors.size() mentors."

 */