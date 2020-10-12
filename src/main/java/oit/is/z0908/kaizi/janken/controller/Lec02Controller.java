package oit.is.z0908.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {
  @GetMapping("/lec02")
  public String lec02() {
    return "lec02.html";
  }

  @GetMapping("/lec02janken")
  public String lec02janken(@RequestParam final String hand, final ModelMap model) {
    final String hand1 = hand;
    model.addAttribute("Hand", hand1);
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam final String name, final ModelMap model) {
    final String name1 = name;
    model.addAttribute("player", name1);
    return "lec02.html";
  }
}
