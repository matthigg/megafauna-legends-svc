package com.example.demo.megafaunaLegends;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Megafauna {
  
  @Id
  @SequenceGenerator(
    name = "megafauna_sequence",
    sequenceName = "megafauna_sequence",
    allocationSize = 1
  )
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "megafauna_sequence"
  )
  private Long id;
  private String pizzaId;
  private Integer hp;
  private Integer maxHp;
  private Integer level;

  public Megafauna () {}

  public Megafauna (
    Long id,
    String pizzaId,
    Integer hp,
    Integer maxHp,
    Integer level
  ) {
    this.id = id;
    this.pizzaId = pizzaId;
    this.hp = hp;
    this.maxHp = maxHp;
    this.level = level;
  }

  public Megafauna (
    String pizzaId,
    Integer hp,
    Integer maxHp,
    Integer level
  ) {
    this.pizzaId = pizzaId;
    this.hp = hp;
    this.maxHp = maxHp;
    this.level = level;
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPizzaId() {
    return pizzaId;
  }

  public void setPizzaId(String pizzaId) {
    this.pizzaId = pizzaId;
  }

  public Integer getHp() {
    return hp;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public Integer getmaxHp() {
    return maxHp;
  }

  public void setMaxHp(Integer maxHp) {
    this.maxHp = maxHp;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", pizzaId='" + pizzaId + '\'' +
      ", hp='" + hp + '\'' +
      ", maxHp='" + maxHp +
      ", level='" + level +
      '}';
  }
}
