import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
  Sharpie one;

  @Before
  public void setup(){
    one = new Sharpie();
  }

  @Test
  public void checkIfUseDecreasesInkAmount() {
    one.inkAmount = 1;
    one.use();
    assertEquals(false,one.isUsable());
  }

  @Test
  public void checkIfIsUsableReturnsFalseWhenSharpieNotUsable() {
    one.inkAmount = 0;
    assertEquals(false,one.isUsable());
  }

  @Test
  public void checkIfIsUsableReturnsTrueWhenSharpieUsable(){
    one.inkAmount = 50;
    assertEquals(true,one.isUsable());
  }
}