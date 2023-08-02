package com.example.demo.megafaunaLegends;

public class Megafauna {
  
  private Long id;
  private String pizzaId;
  private Integer hp;
  private Integer maxHp;
  private Integer level;

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
