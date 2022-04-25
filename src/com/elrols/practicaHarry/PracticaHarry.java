package com.elrols.practicaHarry;

import com.elrols.practicaHarry.entity.Character;

public class PracticaHarry {

    public void runPracticaHarry(){
        Character p1 = new Character("Dumbledore", "Gryffindor", "Masculino", "Fenix");
        Character p2 = new Character( "Snape", "Slytherin", "Masculino", "Cierva");
        Character p3 = new Character("Hermione Granger", "Gryffindor", "Femenino","Nutria");
        Character p4 = new Character("Harry Potter", "Gryffindor", "Masculino", "Ciervo");
        Character p5 = new Character("Nymphadora Tonk", "", "Femenino", "Lobo");


        System.out.format("+-----------------+------+%n");
        System.out.format("|Persona 1               |%n");
        System.out.format("+-----------------+------+%n");
        System.out.println(p1.toString());

        System.out.format("+-----------------+------+%n");
        System.out.format("|Persona 2               |%n");
        System.out.format("+-----------------+------+%n");
        System.out.println(p2.toString());

        System.out.format("+-----------------+------+%n");
        System.out.format("|Persona 3               |%n");
        System.out.format("+-----------------+------+%n");
        System.out.println(p3.toString());

        System.out.format("+-----------------+------+%n");
        System.out.format("|Persona 4               |%n");
        System.out.format("+-----------------+------+%n");
        System.out.println(p4.toString());

        System.out.format("+-----------------+------+%n");
        System.out.format("|Persona 5               |%n");
        System.out.format("+-----------------+------+%n");
        System.out.println(p5.toString());
    }

}
