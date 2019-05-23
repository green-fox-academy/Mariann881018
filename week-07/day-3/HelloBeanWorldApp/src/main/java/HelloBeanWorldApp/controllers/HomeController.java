package HelloBeanWorldApp.controllers;

import HelloBeanWorldApp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController implements CommandLineRunner {

  @Autowired
  @Qualifier("Printer")
  private Printer printer;

  @Autowired
  @Qualifier("RedColor")
  private RedColor redColor;

  @Autowired
  @Qualifier("BlueColor")
  private BlueColor blueColor;

  @Autowired
  @Qualifier("BlackColor")
  private BlackColor blackColor;

  @Autowired
  private UtilityService utilityService;

  @GetMapping("/")
  @ResponseBody
  public String index(){
    // printer.log("Hello controller");
    redColor.printColor();
    blueColor.printColor();
    blackColor.printColor();
    return "Hello";
  }

  @RequestMapping("/useful")
  public String useful(){
    return "useful";
  }

  @RequestMapping("/useful/colored")
  public String usefulColored(Model model){
    model.addAttribute("utilityService", utilityService);
    return "empty";
  }

  @RequestMapping("/useful/encode")     //http://localhost:8080/useful/encode?word=example&number=1
  public String encode(Model model, @RequestParam String word, int number){
    model.addAttribute("result",utilityService.caesar(word, number));
    return "encodeDecode";
  }

  @RequestMapping("/useful/decode")    //http://localhost:8080/useful/decode?word=fybnqmf&number=1
  public String decode(Model model, @RequestParam String word, @RequestParam int number){
    model.addAttribute("result",utilityService.caesar(word, -number));
    return "encodeDecode";
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("akarmi");
  }
}
