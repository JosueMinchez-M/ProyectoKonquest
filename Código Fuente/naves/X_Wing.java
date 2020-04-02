package com.konquest.naves;

/**
 *
 * @author joshua
 */
public class X_Wing extends Naves{
    
    public X_Wing(String nombreNave, int espacio, int costoProduccion, double velocidad){
        super(nombreNave, espacio, costoProduccion, velocidad);
    }
    
    @Override
    public void printMe(){
        System.out.println("NAVE: " + getNombreNave() + "\nCAPACIDAD: " + getCapacidad()
        + " espacios\nCOSTO: " + getCostoProduccion() + " galactus\nVELOCIDAD: " + getVelocidad() + " años luz\n");
    }
}
