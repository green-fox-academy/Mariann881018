public class ConditionalVariableMutation {
  public static void main(String[] args) {

    double a = 24;
    int out = 0;
    if ((a % 2) == 0){
      out++;
      System.out.println(out);
    }

    int b = 10;
    String out2;

    if ((b > 10) && (b < 20)) {
      out2 = "Sweet!";
      System.out.println(out2);
    } else if (b < 10){
      out2 = "Less!";
      System.out.println(out2);
    } else {
      out2 = "More!";
      System.out.println(out2);
    }

    int c = 123;
    int credits = 30;
    boolean isBonus = true;

    if ((credits>=50) && (isBonus==false)){
      c-=2;
      System.out.println(c);
    } else if ((credits<50) && (isBonus==false)){
      c--;
      System.out.println(c);
    } else if(isBonus==true){
      System.out.println(c);
    }

    int d = 2;
    int time = 201;
    String out3;

    if ((d % 4 == 0) && (time<=200)){
      out3 = "check";
      System.out.println(out3);
    } else if (time>200){
      out3 = "Time out";
      System.out.println(out3);
    } else {
      out3 = "Run Forest Run!";
      System.out.println(out3);
    }
  }
}
