import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter. The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt). Return "X", "O" or "Draw" based on the input file
    //System.out.println(ticTacResult("win-o.txt"));  // Should print "O"
    //System.out.println(ticTacResult("win-x.txt")); // Should print "X"
    System.out.println(ticTacResult("draw.txt")); // Should print "Draw"
  }
  public static String ticTacResult(String file) {
    Path inputfile = Paths.get(file);
    List<String> linesOfFile = new ArrayList<>();
    try {
      linesOfFile = Files.readAllLines(inputfile);
      String result = "TicTac";
      //   for (String s : linesOfFile) {
      if (linesOfFile.get(0) =="O") {                   // s.startWith("OXO") == true
        result = "O";
      } else if (linesOfFile.get(0)=="X" && linesOfFile.get(2)== "O") {  //s.startsWith("XOO") == true  //else if (s.substring(0,2)== "XOO")
        result = "X";
      } else if (linesOfFile.get(0)== "X" && linesOfFile.get(2)== "X") {  // s.startsWith("XOX") == true
        result = "Draw";
      }
      //}
      return result;
    } catch (IOException e) {
      System.out.println("I cannot read the file!");
    } return result;
  }
}


/*

 */