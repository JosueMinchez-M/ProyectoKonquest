package com.konquest.diseñomapa;

/**
 *
 * @author joshua
 */
public class Tierra extends Planeta{
    private String nombrePlaneta;
    private String tipoGuerrero;
    private int dineroProducido;
    
    public Tierra(){
    }
    
    public Tierra(String nombrePlaneta, String tipoGuerrero, int dineroProducido, double probabilidadDistribucion, int cantidadGuerreros){
        super(probabilidadDistribucion, cantidadGuerreros);
        this.nombrePlaneta = nombrePlaneta;
        this.tipoGuerrero = tipoGuerrero;
        this.dineroProducido = dineroProducido;       
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }
    
    public String getTipoGuerrero() {
        return tipoGuerrero;
    }

    public void setTipoGuerrero(String guerrero) {
        this.tipoGuerrero = guerrero;
    }

    public int getDineroProducido() {
        return dineroProducido;
    }

    public void setDineroProducido(int dineroProducido) {
        this.dineroProducido = dineroProducido;
    }
    @Override
    public double getProbabilidadDistribucion() {
        return probabilidadDistribucion;
    }
    
    @Override
    public void printMe(){
        System.out.println("\nPLANETA " + getNombrePlaneta());
        System.out.println("--------------");
        System.out.println("GUERRERO: " + getTipoGuerrero() + "\nDINERO PRODUCIDO: " + "Entre 50-100 Galactus" 
        + "\nCANTIDAD GUERREROS: " + "Entre 15-25 Guerreros Mole" + "\n");
    }
    
}
