import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagram;

  @Before
  public void setupAnagram() {
    anagram = new Anagram();
  }

  @Test
  public void checkIfReturnsTrueCorrectly(){
    assertEquals(true, anagram.anaGram("apple","apple"));
  }

  @Test
  public void checkIfNotReturnsFalseCorrectly(){
    assertNotEquals(false, anagram.anaGram("dog","bog"));
  }

  @Test
  public void checkIfTwoStringsDiffLenght(){
    assertEquals(false, anagram.anaGram("apple","pear"));
  }


}