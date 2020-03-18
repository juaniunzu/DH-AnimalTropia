package com.company.animal;

import com.company.Mate;
import com.company.TomadorDeMate;


public class Reptil extends Animal implements TomadorDeMate {

  public Reptil(String nombre, Double energia) {
    super(nombre, energia);
  }

  @Override
  public void tomarMate(Mate unMate) {
    this.recibirMate();
    this.energia = this.energia * (Math.pow(2, unMate.getUnidades()));
    this.devolverMate();
  }

  private void recibirMate(){
    System.out.println(this.nombre + " recibe el mate. Su energía es de " + this.energia + ". Toma el mate.");
  }

  private void devolverMate(){
    System.out.println(this.nombre + " devuelve el mate vacío. Ahora su energía es de " + this.energia);
  }
}
