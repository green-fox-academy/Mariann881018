public class Student {
  String nameS;

  public Student(String name){
    this.nameS = name;
  }

  public void learn(){
    System.out.println("I'm learning hard...");
  }

  public void question(Teacher teacher){
    System.out.println(teacher.nameT + "Could you please explain this....?");
  }
}
