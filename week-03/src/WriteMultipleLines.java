import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
// Create a function that takes 3 parameters: a path, a word and a number and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

    write5Lines("my-file.txt", "apple", 5);
  }

  public static void write5Lines (String path, String inputWord, int n) {

    List<String> lines = new ArrayList<>();

    try { Path sourceFile = Paths.get(path);
      for (int i = 0; i < n; i++){
        lines.add(inputWord);
      Files.write(sourceFile,lines);}
      System.out.print(Files.readAllLines(sourceFile));
    } catch (IOException ex){
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}

