package com.example.demo.megafaunaLegends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "megafauna")
public class MegafaunaController {
  
  // private final MegafaunaService megafaunaService;
  private final MegafaunaService megafaunaService;

  @Autowired
  public MegafaunaController(MegafaunaService megafaunaService) {
    this.megafaunaService = megafaunaService;
  }

  // @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Megafauna> getMegafauna() {
    return megafaunaService.getMegafauna();
	}
}
