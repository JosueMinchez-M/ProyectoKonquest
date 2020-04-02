package com.konquest.naves;

/**
 *
 * @author joshua
 */
public class Naves {
    private String nombreNave;
    private int capacidad;
    private int costoProduccion;
    private double velocidad;
    
    public Naves(){
        
    }
    
    public Naves(String nombreNave, int capacidad, int costoProduccion, double velocidad){
        this.nombreNave = nombreNave;
        this.capacidad = capacidad;
        this.costoProduccion = costoProduccion;
        this.velocidad = velocidad;        
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public int getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(int costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public void printMe(){
        System.out.println("NAVE: " + getNombreNave() + "\nCAPACIDAD: " + getCapacidad()
        + " espacios\nCOSTO: " + getCostoProduccion() + " galactus\nVELOCIDAD: " + getVelocidad() + " años luz\n");
    }
}
