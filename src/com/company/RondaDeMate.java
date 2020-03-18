package com.company;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class RondaDeMate {

  private Robot robotCebador;
  private ArrayList<TomadorDeMate> integrantesDeRonda;

  public RondaDeMate(Robot robotCebador) {
    this.robotCebador = robotCebador;
    this.integrantesDeRonda = new ArrayList<TomadorDeMate>();
  }

  public void agregarIntegrante(TomadorDeMate integrante){
    this.integrantesDeRonda.add(integrante);
  }

  public void empezarRonda(){
    System.out.println("Arranca la ronda de mate");
    for (TomadorDeMate tomadorDeMate : integrantesDeRonda) {
      robotCebador.cebarMate(tomadorDeMate);
    }
  }

}
