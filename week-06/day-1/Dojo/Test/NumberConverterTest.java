import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberConverterTest {
  NumberConverter test;

  @Before
  public void setup() {
    test = new NumberConverter();
  }

  @Test
  public void testIfReturnsOne(){
    Map<Integer,String> myMap = new HashMap<>();
    assertEquals("one",test.convert(1));
  }

  @Test
  public void testIfWorksFromOneToNine(){
    assertEquals("nine",test.convert(9));
  }

  @Test
  public void testIfreturnsTwenty(){
    assertEquals("twentytwo",test.convert(22));
  }
}