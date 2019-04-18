public class FarmMain {
  public static void main(String[] args) {
    Farm myFarm = new Farm(3);

    Animal chicken = new Animal("chicken");
    Animal pig = new Animal("pig");
    Animal goat = new Animal("goat");

    myFarm.add(chicken);
    myFarm.add(pig);
    myFarm.add(goat);

    System.out.println("We have " + myFarm.animals.size() + " animals now");
    myFarm.breed();
    myFarm.breed();
    System.out.println(myFarm.animals.size());


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
