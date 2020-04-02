package com.konquest.constructores;

/**
 *
 * @author joshua
 */
public class MaestroObra extends Constructores {
    
    public MaestroObra(String tipoConstructor, int tiempoConstruir, int precioCompra, int precioVenta, String construye){
        super(tipoConstructor, tiempoConstruir, precioCompra, precioVenta, construye);
    }
    
    @Override
    public void printMe(){
        System.out.println("CONSTRUCTOR: " + getTipoConstructor() + "\nTIEMPO PARA CONSTRUIR: " 
                + getTiempoConstruir() + " turnos\nPRECIO COMPRA: " + getPrecioCompra() + 
                " galactus\nPRECIO VENTA: " + getPrecioVenta() + " galactus\nCONSTRUYE NAVE: " + getConstruye() + "\n");
    }
}
