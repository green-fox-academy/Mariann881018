
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    Path myPath = Paths.get("myfile.txt");         //  put the filename in "  "
    try {
      List<String> linesOfFile = Files.readAllLines(myPath);       // put the lines to a list of Strings
      linesOfFile = Files.readAllLines(myPath);

      for (String newString : linesOfFile) {
        System.out.println(linesOfFile.get(Integer.parseInt(newString)));
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}

/*
  public static void sumAges(String path) {
    Path src = Paths.get(path);
    try {
      List<String> data = Files.readAllLines(src);

      data = Files.readAllLines(src);
      int sum = 0;
      for (String s : data) {
        String[] arr = s.split(";");
        sum += Integer.parseInt(arr[1]);
      }
      System.out.println(sum);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
}
 */