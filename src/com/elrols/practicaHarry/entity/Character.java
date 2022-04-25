package com.elrols.practicaHarry.entity;

public class Character {

    private String nombre;
    private String casa;
    private String genero;
    private String boggartPatronus;

    public Character(){}

    public Character(String nombre, String casa, String genero, String boggartPatronus) {
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.boggartPatronus = boggartPatronus;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCasa() {
        return casa;
    }

    public String getGenero() {
        return genero;
    }

    public String getBoggartPatronus() {
        return boggartPatronus;
    }

    public boolean setNombre(String nombre) {
        if( nombre.isEmpty() )
            return false;

        this.nombre = nombre;
        return true;
    }

    public boolean setCasa(String casa) {
        if( casa.isEmpty() )
            return false;

        this.casa = casa;
        return true;
    }

    public boolean setGenero(String genero) {
        if( genero.isEmpty() )
            return false;

        this.genero = genero;
        return true;
    }

    public boolean setBoggartPatronus(String boggartPatronus) {
        if( boggartPatronus.isEmpty() )
            return false;

        this.boggartPatronus = boggartPatronus;
        return true;
    }

    @Override
    public String toString() {
        return "Nombre  : "+getNombre()+"\n"+
                "Casa    : "+getCasa()+"\n"+
                "Genero  : "+getGenero()+"\n"+
                "Boggart : "+getBoggartPatronus();
    }
}

