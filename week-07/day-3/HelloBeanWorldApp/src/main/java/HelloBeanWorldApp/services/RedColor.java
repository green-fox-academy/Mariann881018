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

//Any kind of color class (for i.e. RedColor) can implement this interface
// overriding printColor(); sout-ing for i.e. "It is red in color...".
//Implement the interface multiple times for different colors

//Annotate one of them with @Service and autowire the interface in the application and use the printColor method
//Move the annotation to another implementation
//Change the implementations to use the Printer service with autowiring (instead of sout-ing)