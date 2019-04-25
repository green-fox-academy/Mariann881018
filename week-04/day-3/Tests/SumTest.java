import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SumTest {
  Sum testSum;

  @Before
  public void setup(){
    testSum = new Sum();
  }

  @Test
  public void shouldReturnCorrectSum(){
    int[] nums ={1,2,3,4,5};
    List<Integer> testList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++){
      testList.add(nums[i]);
    }
    assertEquals(15,testSum.summingElements(testList));
  }

  @Test
  public void shouldNotReturnCorrectSum(){
    int[] nums ={1,2,3,4,5};
    List<Integer> testList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++){
      testList.add(nums[i]);
    }
    assertNotEquals(4,testSum.summingElements(testList));
  }

  @Test
  public void testWithEmptyList(){
    

  }
}

/*


 */