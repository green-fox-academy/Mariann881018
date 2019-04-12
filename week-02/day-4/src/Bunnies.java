public class Bunnies{
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
     int bunnies = 8;
     int ears = noOfEars(bunnies);
    System.out.println(ears);

  }

  public static int noOfEars(int a){
    if (a == 1){
      return 2;
    } else {
      return  2 + noOfEars(a-1);
    }
  }
}

/*

2*2*2
2*2

  public static int powerN(int n, int m){
    if ( m == 1 ){
      return n;
    } else {
      return n * powerN(n, m-1);    //

 */