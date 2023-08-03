package com.example.demo.megafaunaLegends;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MegafaunaConfig {
  
  @Bean
  CommandLineRunner commandLineRunner(MegafaunaRepository repository) {
    return args -> {
      Megafauna bethPizzaA = new Megafauna(
        // 1L,
        "v001",
        40,
        50,
        1
			);

      Megafauna bethPizzaB = new Megafauna(
        // 2L,
        "f001",
        30,
        50,
        1
			);

      repository.saveAll(
        List.of(bethPizzaA, bethPizzaB)
      );
    };
  }
}
