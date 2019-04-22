import java.util.ArrayList;

public class Farm {
   static int slots;
   static ArrayList<Animal> animals;

   public Farm(){
   }

   public Farm(int slots) {
    animals = new ArrayList<>();
  }

   public void add(Animal animal) {
   animals.add(animal);
   }

  void breed(){

    if (Farm.slots > 0){
//      animals.add(new Animal animal());
    }

   // void slaughter(){
    //  animals.remove()
   // }
  }
}
/*
Reuse your Animal class
Create a Farm class
  it has list of Animals
  it has slots which defines the number of free places for animals
     breed() -> creates a new animal if there's place for it
     slaughter() -> removes the least hungry animal
 */