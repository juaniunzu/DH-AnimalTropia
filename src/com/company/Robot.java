package com.company;

public class Robot {

  private String nombre;
  private Mate unMate;

  public Robot(String nombre, Mate unMate) {
    this.nombre = nombre;
    this.unMate = unMate;
  }

  public String getNombre() {
    return nombre;
  }

  public void cebarMate(TomadorDeMate unTomador){
    unTomador.tomarMate(this.unMate);
  }
}
