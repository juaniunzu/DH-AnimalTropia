package com.company.animal;

public class Animal {

  protected String nombre;
  protected Double energia;

  public Animal(String nombre, Double energia) {
    this.nombre = nombre;
    this.energia = energia;
  }

  public Double getEnergia() {
    return energia;
  }
}
