package com.konquest.constructores;

/**
 *
 * @author joshua
 */
public class ManejadorConstructores {
    
    public Constructores [] crearDatos(){
        Constructores [] constructor = new Constructores[4];
        constructor [0] = new Constructores("Obrero", 3, 50, 40, "Naboo N-1");
        constructor [1] = new Constructores("Maestro de Obra", 2, 100, 70, "X-Wing");
        constructor [2] = new Constructores("Arquitecto", 1, 250, 175, "Millenial Falcon");
        constructor [3] = new Constructores("Ingeniero", 1, 300, 200, "Star Destroyer");
        return constructor;
    }
    
    public void printConstructores(Constructores [] constructor){
        for (int i = 0; i < constructor.length; i++) {
            constructor [i].printMe();
        }
    }
}
