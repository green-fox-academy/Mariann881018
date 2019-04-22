public class Colors {
  public static void main(String[] args) {
    String[][] colors = {
            {"forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"},
            {"orchid", "violet", "pink", "hot pink"}};

      for(String[] i : colors){
        for (String j : i){
        System.out.print(j + ", ");
        }
      System.out.println();

      }
    for (int i = 0; i < colors.length; i++){
      for (int j = 0; j < colors[i].length; j++){
        System.out.print(colors[i][j]+ ", ");
      } System.out.println();
    }
  }
}
