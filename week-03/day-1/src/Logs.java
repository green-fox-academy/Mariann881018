import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'. Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

    uniqIP("log.txt");

  }
  public static void uniqIP(String inputfile) { //

    ArrayList<String> ips = new ArrayList<>();
    ArrayList<String> uniqIps = new ArrayList<>();
    try {
      Path logFile = Paths.get(inputfile);
      List<String> linesOfLog = Files.readAllLines(logFile);

      for (String s : linesOfLog) {     //iterate through each item of linesOfLog
        ips.add(s.substring(27, 38));   // from each line add the substring to the ips arraylist
      }
      for (String a :ips) {         //iterate through each item of ips
        if (!uniqIps.contains(a)) {    // if uniIps does not contain it yet, add item to it
          uniqIps.add(a);
        }
      }
      System.out.println(uniqIps);
    } catch (IOException ex) {
      System.out.println("Cannot read the file");
    }
  }
}
