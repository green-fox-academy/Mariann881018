public class Colors {
  public static void main(String[] args) {
    String[][] colors = {
            {"forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"},
            {"orchid", "violet", "pink", "hot pink"}};

      for(String[] i : colors) {  // goes through the elements of 0. row of colors array, stores each item in a one-D i array
        for (String j : i) {      // goes through the elements of i array, puts elements in one long string
        System.out.print(j + ", ");  // prints the string with separator
      }
      System.out.println();   //
    }



    for (int i = 0; i < colors.length; i++){  //--loop through trows
      for (int j = 0; j < colors[i].length; j++){    //---loop through the columns
        System.out.print(colors[i][j]+ ", ");
      } System.out.println();
    }
  }
}

// - Create a two dimensional array which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green: `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red: `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink: `"orchid", "violet", "pink", "hot pink"`
