package com.konquest.naves;

/**
 *
 * @author joshua
 */
public class NabooN_1 extends Naves {
    
    public NabooN_1(String nombreNave, int espacio, int costoProduccion, double velocidad){
        super(nombreNave, espacio, costoProduccion, velocidad);
    }
    
    @Override
    public void printMe(){
        System.out.println("NAVE: " + getNombreNave() + "\nCAPACIDAD: " + getCapacidad()
        + " espacios\nCOSTO: " + getCostoProduccion() + " galactus\nVELOCIDAD: " + getVelocidad() + " años luz\n");
    }
}
