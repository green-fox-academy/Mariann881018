import com.sun.org.apache.bcel.internal.generic.LSTORE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another, It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    copyFile("sourcefile.txt", "destinationfile.txt");
  }

  public static void copyFile (String pathOfSource, String pathOfDest) {
    Path sourceFile = Paths.get(pathOfSource);
    Path destFile = Paths.get(pathOfDest);
    try {
      boolean b = true;
      List<String> lines = Files.readAllLines(sourceFile);   // arraylist named lines created to copy all lines of sourceFile
      Files.write(destFile,lines);
      for (String s : lines) {        // iterates through lines to have the lines of sourceFile
      }     //  System.out.println(s);
      System.out.println(b);
    } catch (FileNotFoundException e) {
      System.out.println("Copy unsuccessful");
    } catch (Exception ex) {
      System.out.println("Copy unsuccessful");
    }
  }
}
