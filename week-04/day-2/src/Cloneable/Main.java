package Cloneable;

public class Main {
  public static void main(String[] args) {

    Student john = new Student("John", 20,"male","BME");
    try {
      Student johnTheClone = (Student)john.clone();
      john.setPrevOrg("Google");
      System.out.println(john.getPrevOrg());
      System.out.println(johnTheClone.getPrevOrg());
    } catch (CloneNotSupportedException e) {
      System.out.println("nem jó");
    }
  }
}
