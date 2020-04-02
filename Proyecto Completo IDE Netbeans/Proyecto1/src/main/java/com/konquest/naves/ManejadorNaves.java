/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konquest.naves;

/**
 *
 * @author joshua
 */
public class ManejadorNaves {
    
    public Naves[] crearDatos(){
        Naves[] nave = new Naves[4];
        nave[0] = new Naves("Naboo N-1", 25, 40, 1);
        nave[1] = new Naves("X-Wing", 42, 50, 1.25);
        nave[2] = new Naves("Millenial Falcon", 58, 70, 1.5);
        nave[3] = new Naves("Star Destroyer", 80, 100, 1.75);
        return nave;
    }
    
    public void printNaves(Naves[] nave){
        for (int i = 0; i < nave.length; i++) {
            nave[i].printMe();
        }
    }
}
