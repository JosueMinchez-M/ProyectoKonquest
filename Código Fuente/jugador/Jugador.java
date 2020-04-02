package com.konquest.jugador;
/**
 *
 * @author joshua
 */
public class Jugador{
    private String nombre;
    private int galactus;
    
    public Jugador(){
        
    }
    
    public Jugador(String nombre, int galactus){
        this.nombre = nombre;
        this.galactus = galactus;
    }
    // MUestra al jugador
    public String getNombre() {
        return nombre;
    }
    //Obtiene al jugador
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //muestra galactus
    public int getGalactus() {
        return galactus;
    }
    //obtiene Galactus
    public void setGalactus(int galactus) {
        this.galactus = galactus;
    }
    public void printJugadorGalactus(){
        System.out.println("JUGADOR: " + getNombre() + " GALACTUS: " + getGalactus());
    }
    
    @Override
    public String toString(){
        return getNombre();
    }
}
