public class Colors {
  public static void main(String[] args) {
    String[][] colors = {{"forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"},
    {"orchid", "violet", "pink", "hot pink"}};

      for(String[] i : colors) {  // goes through the elements of colors array (listed above), stores each item in an i
        for (String j : i) {
        System.out.print(j + ", ");
      }
      System.out.println();
    }
  }
}

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green: `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red: `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink: `"orchid", "violet", "pink", "hot pink"`
// int[][] matrix = {{1, 3}, {2, 3, 1}};