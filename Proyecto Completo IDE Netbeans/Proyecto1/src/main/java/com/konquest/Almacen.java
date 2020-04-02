package com.konquest;

import com.konquest.constructores.Constructores;
import com.konquest.constructores.ManejadorConstructores;
import com.konquest.guerreros.Guerreros;
import com.konquest.guerreros.ManejadorGuerreros;
import com.konquest.naves.ManejadorNaves;
import com.konquest.naves.Naves;

/**
 *
 * @author joshua
 */
public class Almacen {
    ManejadorGuerreros guerrerosM = new ManejadorGuerreros();    
    Guerreros [] guerrero = guerrerosM.crearDatos();
    ManejadorNaves navesM = new ManejadorNaves();
    Naves [] nave = navesM.crearDatos();
    ManejadorConstructores constructoresM = new ManejadorConstructores();
    Constructores [] constructor = constructoresM.crearDatos();
    
    public void datosGuerreros(){
        guerrerosM.printGuerreros(guerrero);
    }
    
    public void datosNaves(){
        navesM.printNaves(nave);
    }
    
    public void datosConstructores(){
        constructoresM.printConstructores(constructor);
    }
}
