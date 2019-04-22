class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  void skipDays(int n) {
    this.skippedDays += n;
  }

  void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays
     + " days from the course already.");
  }

  void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }
}

/*
Create a Student class that has the same fields and methods as the Person class, and has the following additional
fields:
 - previousOrganization: the name of the student’s previous company / school
 - skippedDays: the number of days skipped from the course
methods:
 - getGoal(): prints out "Be a junior software developer."
 - introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
 - skipDays(numberOfDays): increases skippedDays by numberOfDays
The Student class has the following constructors:
 - Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
 - Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
 */