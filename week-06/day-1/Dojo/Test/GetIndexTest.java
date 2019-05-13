import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {

  GetIndex test;

  @Before
  public void setup(){
    test = new GetIndex();
  }

  @Test
  public void firstTest(){
    List<Integer> myList = new ArrayList<>();
    assertEquals(-1,test.getIndex(1,myList));
  }

  @Test
  public void returnThree(){
    List<Integer> myList = Arrays.asList(1);
    assertEquals(0,test.getIndex(1,myList));

  }
  @Test
  public void returnSecond(){
    List<Integer> myList = Arrays.asList(1,2);
    assertEquals(1,test.getIndex(2,myList));
  }
}