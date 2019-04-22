public class TeacherStudent {
  public static void main(String[] args) {

    Student student1 = new Student("Peti");
    Student student2 = new Student("Zoli");

    Teacher teacher = new Teacher("James");

    student1.question(teacher);
    student2.learn();
    teacher.teach(student2);
    teacher.answer();
  }
}