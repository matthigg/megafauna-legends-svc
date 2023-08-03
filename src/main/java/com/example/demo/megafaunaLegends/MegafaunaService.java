package com.example.demo.megafaunaLegends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MegafaunaService {

    private final MegafaunaRepository megafaunaRepository;

  @Autowired
  public MegafaunaService(MegafaunaRepository megafaunaRepository) {
    this.megafaunaRepository = megafaunaRepository;
  }
  
  public List<Megafauna> getmegafaunas() {
    return megafaunaRepository.findAll();
	}
  
}
