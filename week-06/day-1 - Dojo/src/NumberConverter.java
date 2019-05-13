import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class NumberConverter {
  public static void main(String[] args) {
    System.out.println(convert(40));
  }

  public static String convert(Integer number) {
    try {
      Path filePath = Paths.get("numbers.txt");
      List<String> line = Files.readAllLines(filePath);
      HashMap<Integer, String> numberMap = new HashMap<>();
      for (int i = 0; i < line.size(); i++) {
        String[] string = line.get(i).split(" ");
        numberMap.put(Integer.valueOf(string[0]), string[1]);
      } if (99 > number && number > 20) {
        Integer m = number % 10;
        Integer n = number - m;
        return numberMap.get(n) + numberMap.get(m);
      } else if (number> 99 )
        return numberMap.get(number);
    } catch (Exception e) {
      System.out.println("no file");
    }
    return null;
  }
}