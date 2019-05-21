package myBasicWebshop.controllers;

import myBasicWebshop.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HelloWorld {
  List<ShopItem> itemsList= new ArrayList<>();

  public HelloWorld() {
    itemsList.add(new ShopItem("Running shoes","Nike running shoes", 50000,10));
    itemsList.add(new ShopItem("Printer","HP printer", 20000,5));
    itemsList.add(new ShopItem("Coca Cola","0.33L canned coke", 200,200));
    itemsList.add(new ShopItem("T-shirt","Some really nice shirts", 5000,0));
  }

  @RequestMapping("/webshop")
  public String webshop(Model model){
    model.addAttribute("items", itemsList);
    return "webshop";
  }

  @RequestMapping("/webshop/only-available")
  public String onlyAval(Model model){
    model.addAttribute("items", getAvalItems());
    return "webshop";
  }

  public List<ShopItem> getAvalItems() {
    List<ShopItem> avalItems = itemsList.stream()
            .filter(n -> n.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    return avalItems;
  }

  @RequestMapping("/webshop/cheapest-first")
  public String cheapestFirst(Model model){
    model.addAttribute("items", cheapestFirst());
    return "webshop";
  }

  public List<ShopItem> cheapestFirst() {
    List<ShopItem> orderedList = itemsList.stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList());
    return orderedList;
  }

  @RequestMapping("/webshop/contains-nike")
  public String containsNike(Model model){
    model.addAttribute("items", containsNike());
    return "webshop";
  }

  public List<ShopItem> containsNike() {
    List<ShopItem> filtered = itemsList.stream()
            .filter(n -> n.getName().toLowerCase().contains("nike".toLowerCase())
                    || n.getDescription().toLowerCase().contains("nike".toLowerCase()))
            .collect(Collectors.toList());
    return filtered;
  }

}
