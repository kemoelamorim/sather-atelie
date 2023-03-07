package br.com.sather.atelieback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AnonimoController {
  @GetMapping("/")
  public String bemVindo(){
    return "Bem vindo";
  }
}
