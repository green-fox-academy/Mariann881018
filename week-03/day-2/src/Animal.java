public class Animal {
  int hunger;
  int thirst = 50;
  String type;

  public Animal(String type){
  }

  public void eat(){
    System.out.println("eating...");
    hunger -= 1;
    System.out.println("Hunger level: " + hunger);
  }

  public void drink(){
    System.out.println("drinking...");
    thirst -= 1;
    System.out.println("Thirst level: " + thirst);
  }

  public void play(){
    System.out.println("playing...");
    hunger += 1;
    thirst += 1;
    System.out.println(type + "'s thirst level: " + thirst);
    System.out.println(type + "'s hunger level: " + hunger);

  }
}
  /*
Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one
   */