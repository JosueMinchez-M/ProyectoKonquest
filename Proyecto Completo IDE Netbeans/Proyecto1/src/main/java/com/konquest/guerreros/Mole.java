package com.konquest.guerreros;

/**
 *
 * @author joshua
 */
public class Mole extends Guerreros{
    
    public Mole(String nombre, String ataqueEspecial, double factorMuerte, int nave){
        super(nombre,ataqueEspecial, factorMuerte, nave);
    }
    
    @Override
    public void pirntMe(){
        System.out.println("GUERRERO: " + getNombre() + "\nATAQUE: " + getAtaqueEspecial() + 
                "\nFACTOR DE MUERTE: " + getFactorMuerte() + "\nOCUPA EN NAVE: " + getEspacioEnNave() + " espacio/s\n");
    }
    
}
