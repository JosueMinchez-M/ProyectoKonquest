package com.konquest.constructores;

/**
 *
 * @author joshua
 */
public class Constructores {
    private String tipoConstructor;
    private int tiempoConstruir;
    private int precioCompra;
    private int precioVenta;
    private String construye;
    
    public Constructores(){
        
    }
    
    public Constructores(String tipoConstructor, int tiempoConstruir, int precioCompra, int precioVenta, String construye){
        this.tipoConstructor = tipoConstructor;
        this.tiempoConstruir = tiempoConstruir;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.construye = construye;
        
    }

    public String getTipoConstructor() {
        return tipoConstructor;
    }

    public void setTipoConstructor(String tipoConstructor) {
        this.tipoConstructor = tipoConstructor;
    }
    
    public int getTiempoConstruir() {
        return tiempoConstruir;
    }

    public void setTiempoConstruir(int tiempoConstruir) {
        this.tiempoConstruir = tiempoConstruir;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getConstruye() {
        return construye;
    }

    public void setConstruye(String construye) {
        this.construye = construye;
    }
    
    public void printMe(){
        System.out.println("CONSTRUCTOR: " + getTipoConstructor() + "\nTIEMPO PARA CONSTRUIR: " 
                + getTiempoConstruir() + " turnos\nPRECIO COMPRA: " + getPrecioCompra() + 
                " galactus\nPRECIO VENTA: " + getPrecioVenta() + " galactus\nCONSTRUYE NAVE: " + getConstruye() + "\n");
    }
    
}
