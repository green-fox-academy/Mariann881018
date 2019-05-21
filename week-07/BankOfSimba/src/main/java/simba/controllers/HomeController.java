package simba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import simba.models.BankAccount;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
  BankAccount account = new BankAccount();
  List<BankAccount> bankAccountList = new ArrayList<>();

  public HomeController() {
    bankAccountList.add(new BankAccount("Simba",5000,"lion"));
    bankAccountList.add(new BankAccount("Timon",1000,"meerkat"));
    bankAccountList.add(new BankAccount("Pumba",1500,"worthog"));
    bankAccountList.add(new BankAccount("Zazu",500,"bird"));
    bankAccountList.get(0).setKing(true);
    bankAccountList.get(1).setGood(true);
  }

  @GetMapping("/show")
  public String index(Model model) {
    model.addAttribute("account",new BankAccount("Simba", (float) 2000, "lion"));
    return "show";
  }

  @GetMapping("/enjoy")
  public String enjoy() {
    return "enjoy";
  }

  @GetMapping("/multiple")
  public String multipleAccounts(Model model) {
    model.addAttribute("animals", bankAccountList);
    return "multiple";
  }

  @ModelAttribute
  public void setup(Model model) {
    model.addAttribute(bankAccountList);
  }
}
