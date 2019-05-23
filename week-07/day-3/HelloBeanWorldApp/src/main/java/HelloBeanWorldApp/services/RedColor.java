package HelloBeanWorldApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColor{

  @Autowired
  @Qualifier("Printer")
  private Printer printer;

  @Override
  public void printColor() {
    printer.log("This is RedColor");
  }
}
