package com.konquest.guerreros;

/**
 *
 * @author joshua
 */
public class Guerreros {
    private String nombre;
    private String ataqueEspecial;
    private double factorMuerte;
    private int espacioEnNave;
    
    public Guerreros(){
        
    }
    
    public Guerreros(String nombre, String ataqueEspecial, double factorMuerte, int espacioEnNave){
        this.nombre = nombre;
        this.ataqueEspecial = ataqueEspecial;
        this.factorMuerte = factorMuerte;
        this.espacioEnNave = espacioEnNave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public double getFactorMuerte() {
        return factorMuerte;
    }

    public void setFactorMuerte(double factorMuerte) {
        this.factorMuerte = factorMuerte;
    }

    public int getEspacioEnNave() {
        return espacioEnNave;
    }

    public void setEspacioEnNave(int espacioEnNave) {
        this.espacioEnNave = espacioEnNave;
    }
    
    public void pirntMe(){
        System.out.println("GUERRERO: " + getNombre() + "\nATAQUE: " + getAtaqueEspecial() + 
                "\nFACTOR DE MUERTE: " + getFactorMuerte() + "\nOCUPA EN NAVE: " + getEspacioEnNave() + " espacio/s\n");
    }
    
}
