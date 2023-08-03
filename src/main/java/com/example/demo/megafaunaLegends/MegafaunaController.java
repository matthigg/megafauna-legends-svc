package com.example.demo.megafaunaLegends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "megafauna")
public class MegafaunaController {
  
  private final MegafaunaService megafaunaService;

  @Autowired
  public megafaunaController(MegafaunaService megafaunaService) {
    this.megafaunaService = megafaunaService;
  }

  @GetMapping
  public List<Megafauna> getMegafauna() {
    return MegafaunaService.getMegafauna();
	}
}
