import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    try {
      System.out.println(ticTacResult("win-x.txt")); // Should print "Draw"
    } catch (Exception e) {
      System.out.println("cannot find the file");
    }
  }

  private static String ticTacResult(String fileName) throws Exception {
    Path filePath = Paths.get(fileName);
    List<String> content = Files.readAllLines(filePath);

    char[][] chars = new char[3][3];
    chars[0] = content.get(0).toCharArray(); // puts the first line of file to a char array named chars[0]
    chars[1] = content.get(1).toCharArray(); // puts the 2nd line...
    chars[2] = content.get(2).toCharArray(); // puts the 3rd line to chars[2] array

    if ((chars[1][1] == chars[0][0] && chars[1][1] == chars[2][2]) ||
            (chars[1][1] == chars[0][2] && chars[1][1] == chars[2][0])) {
      return String.valueOf(chars[1][1]);
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (chars[i][0] == chars[i][1] && chars[i][0] == chars[i][2]) {
          return String.valueOf(chars[i][0]);
        } else if (chars[0][j] == chars[1][j] && chars[0][j] == chars[2][j]) {
          return String.valueOf(chars[j][0]);
        }
      }
    }
    return "draw"; // Draw
  }
}
