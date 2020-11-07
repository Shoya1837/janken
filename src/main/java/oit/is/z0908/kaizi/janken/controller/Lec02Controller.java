package oit.is.z0908.kaizi.janken.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0908.kaizi.janken.model.Users;
import oit.is.z0908.kaizi.janken.model.UsersMapper;

@Controller
public class Lec02Controller {
  @Autowired
  UsersMapper usersMapper;

  @GetMapping("/lec02")
  public String lec02(ModelMap model, Principal prin) {
    String loginUser = prin.getName();
    ArrayList<Users> Users = usersMapper.selectAll();
    model.addAttribute("users", Users);
    model.addAttribute("login_user", loginUser);
    return "lec02.html";
  }

  @GetMapping("/lec02janken")
  public String lec02janken(@RequestParam final String hand, final ModelMap model) {
    final String hand1 = hand;
    model.addAttribute("Hand", hand1);
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    String name1 = name;
    model.addAttribute("player", name1);
    return "lec02.html";
  }

}
