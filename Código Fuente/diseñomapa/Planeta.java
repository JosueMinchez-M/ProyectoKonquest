package com.konquest.diseñomapa;

/**
 *
 * @author joshua
 */
public class Planeta {
    private String nombre;
    private double porcentajeMuerte;
    private int cantidadConstructores;
    private int cantidadNaves;
    private int cantidadGuerreros;
    double probabilidadDistribucion;
    private int coordenadaFilaX;
    private int coordenadaColumnaY;
    
    public Planeta(){
        
    }

    public Planeta(double probabilidadDistribucion, int cantidadGuerreros){
        this.probabilidadDistribucion = probabilidadDistribucion;
        this.cantidadGuerreros = cantidadGuerreros;
    }
    
    public Planeta(String nombre, double porcentajeMuerte, int cantidadConstructores, 
            int cantidadNaves, int coordenadaFilaX, int coordenadaColumnaY, double probabilidadDistribucion){
        this.nombre = nombre;
        this.porcentajeMuerte = porcentajeMuerte;
        this.cantidadConstructores = cantidadConstructores;
        this.cantidadNaves = cantidadNaves;
        this.coordenadaFilaX = coordenadaFilaX;
        this.coordenadaColumnaY = coordenadaColumnaY;
        this.probabilidadDistribucion = probabilidadDistribucion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentajeMuerte() {
        return porcentajeMuerte;
    }

    public void setPorcentajeMuerte(double porcentajeMuerte) {
        this.porcentajeMuerte = porcentajeMuerte;
    }

    public int getCantidadConstructores() {
        return cantidadConstructores;
    }

    public void setCantidadConstructores(int cantidadConstructores) {
        this.cantidadConstructores = cantidadConstructores;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }

    public int getCantidadGuerreros() {
        return cantidadGuerreros;
    }

    public void setCantidadGuerreros(int cantidadGuerreros) {
        this.cantidadGuerreros = cantidadGuerreros;
    }

    public double getProbabilidadDistribucion() {
        return probabilidadDistribucion;
    }

    public void setProbabilidadDistribucion(double probabilidadDistribucion) {
        this.probabilidadDistribucion = probabilidadDistribucion;
    }

    public int getCoordenadaFilaX() {
        return coordenadaFilaX;
    }

    public void setCoordenadaFilaX(int coordenadaFilaX) {
        this.coordenadaFilaX = coordenadaFilaX;
    }

    public int getCoordenadaColumnaY() {
        return coordenadaColumnaY;
    }

    public void setCoordenadaColumnaY(int coordenadaColumnaY) {
        this.coordenadaColumnaY = coordenadaColumnaY;
    }
    
    
    
    public void printMe(){
        System.out.println("\nNOMBRE: " + getNombre() + "\nPORCENTAJE DE MUERTE: " + getPorcentajeMuerte() + 
                "\nESPACIO CONSTRUCTORES: " + getCantidadConstructores() + "\nESPACIO NAVES: " + getCantidadNaves());
    }
}
