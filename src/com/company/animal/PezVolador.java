package com.company.animal;

import com.company.Mate;
import com.company.TomadorDeMate;

public class PezVolador extends Pez implements TomadorDeMate {

  public PezVolador(String nombre, Double energia) {
    super(nombre, energia);
  }

  @Override
  public void tomarMate(Mate unMate) {
    this.recibirMate();
    this.devolverMate();
  }

  private void recibirMate(){
    System.out.println(this.nombre + " recibe el mate y lo toma.");
  }

  private void devolverMate(){
    System.out.println(this.nombre + " devuelve el mate vacío.");
  }
}
