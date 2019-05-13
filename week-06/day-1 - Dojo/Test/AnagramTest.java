import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram test;

  @Before
  public void setup() {
    test = new Anagram();
  }

  @Test
  public void compare() {
    assertEquals(true,test.anagram("string", "gnirts"));
  }

  @Test
  public void stringLenght() {
    assertEquals(false, test.anagram("string", "str"));
  }

  @Test
  public void firstAndLAstCharacter() {
    assertEquals(false, test.anagram("string", "gtrins"));
  }

}