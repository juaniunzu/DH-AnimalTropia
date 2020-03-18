package com.company;

import com.company.animal.*;

public class Main {

    public static void main(String[] args) {

        //creo robot cebador y su mate
        Mate elMateDeRobocop = new Mate(3);
        Robot robocop = new Robot("robocop", elMateDeRobocop);

        //creo empleados varios
        Reptil unReptil = new Reptil("coco", 10.0);
        Reptil otroReptil = new Reptil("coca", 10.0);
        Reptil unTercerReptil = new Reptil("cuco", 9.0);
        Mamifero unMamifero = new Mamifero("pepa", 4.0);
        Mamifero otroMamifero = new Mamifero("pipa", 5.0);
        Mamifero unTercerMamifero = new Mamifero("pepo", 4.0);
        Pez unPez = new Pez("nemo", 1.0);
        Pez otroPez = new Pez("dory", 2.0);
        PezVolador unPezVolador = new PezVolador("richar", 3.0);
        PezVolador otroPezVolador = new PezVolador("starkey", 3.0);

        //creo ronda de mate y agrego integrantes

        RondaDeMate laRondaDeMate = new RondaDeMate(robocop);
        laRondaDeMate.agregarIntegrante(unReptil);
        laRondaDeMate.agregarIntegrante(otroReptil);
        laRondaDeMate.agregarIntegrante(unMamifero);
        laRondaDeMate.agregarIntegrante(unPezVolador);
        laRondaDeMate.agregarIntegrante(unTercerMamifero);
        laRondaDeMate.agregarIntegrante(unTercerReptil);

        laRondaDeMate.empezarRonda();






    }
}
