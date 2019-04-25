import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters counter;

  @Before
  public void setup(){
    counter = new CountLetters();
  }

  @Test
  public void checkIfReturnsCorrectMap() {
    Map<Character,Integer> expected = new HashMap<>();
    expected.put('a',10);
    expected.put('b',10);
    assertEquals(expected,counter.countLetters("abaabbaaabbbaaaabbbb"));
  }

  @Test
  public void checkIfNotReturnsIncorrectMap(){
    Map<Character,Integer> incorrect = new HashMap<>();
    incorrect.put('a',10);
    incorrect.put('b',10);
    assertNotEquals(incorrect,counter.countLetters("abaabbaaabbbaaaabb"));
  }

  @Test
  public void checkIfNotReturnsEmptyMap(){
    Map<Character,Integer> incorrect = new HashMap<>();
    assertNotEquals(incorrect,counter.countLetters("animals"));
  }

}