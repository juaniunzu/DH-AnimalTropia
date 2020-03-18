package com.company.animal;

import com.company.Mate;
import com.company.TomadorDeMate;

public class Mamifero extends Animal implements TomadorDeMate {

  public Mamifero(String nombre, Double energia) {
    super(nombre, energia);
  }

  @Override
  public void tomarMate(Mate unMate) {
    this.recibirMate();
    this.energia = this.energia + 5 * unMate.getUnidades();
    this.devolverMate();
  }
  
  private void recibirMate(){
    System.out.println(this.nombre + " recibe el mate. Su energía es de " + this.energia + ". Toma el mate.");
  }
  
  private void devolverMate(){
    System.out.println(this.nombre + " devuelve el mate. Ahora su energía es de " + this.energia);
  }
}
