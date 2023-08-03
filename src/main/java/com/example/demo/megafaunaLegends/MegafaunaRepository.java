package com.example.demo.megafaunaLegends;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MegafaunaRepository extends JpaRepository<Megafauna, Long> {
  
  // @Query("SELECT s FROM Megafauna s WHERE s.pizzaId = ?1")
  Optional<Megafauna> findByPizzaId(String pizzaId);
}
