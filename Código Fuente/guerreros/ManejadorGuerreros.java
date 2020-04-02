package com.konquest.guerreros;

/**
 *
 * @author joshua
 */
public class ManejadorGuerreros {
    
    public ManejadorGuerreros(){
        
    }
    
    public Guerreros[] crearDatos(){
        Guerreros[] guerrero = new Guerreros[5];
        
        guerrero [0] = new Guerreros("Mole", "Enterrar a sus victimas", 1.5, 1);
        guerrero [1] = new Guerreros("Nemo", "Tuvo chorro venenoso", 1.6, 1);
        guerrero [2] = new Guerreros("Magma", "Bolas de lava", 1.75, 2);
        guerrero [3] = new Guerreros("Groot", "Toca el suelo y coloca enredaderas trampa", 1.85, 3);
        guerrero [4] = new Guerreros("Fision Guy", "Rayos gama", 1.95, 4);
        return guerrero;
    }
    
    public void printGuerreros(Guerreros[] guerrero){
        for (int i = 0; i < guerrero.length; i++) {
            guerrero[i].pirntMe();
        }
    }
}
