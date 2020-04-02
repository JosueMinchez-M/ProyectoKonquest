package com.konquest.diseñomapa;


/**
 *
 * @author joshua
 */
public class Mapa {
    private int cantidadFilas;
    private int cantidadColumnas;
    int cantidadPlanetas;
    int barraColumnas [];
    int tablero [][];
    public Mapa(){
        
    }
    public Mapa(int cantidadPlanetas){
        this.cantidadPlanetas = cantidadPlanetas;
        
    }
    
    public Mapa(int cantidadFilas, int cantidadColumnas, int cantidadPlanetas){
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.cantidadPlanetas = cantidadPlanetas;
    }

    public void setCantidadFilas(int cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }

    public void setCantidadColumnas(int cantidadColumnas) {
        this.cantidadColumnas = cantidadColumnas;
    }
    
    public int getCantidadPlanetas() {
        return cantidadPlanetas;
    }

    public void setCantidadPlanetas(int cantidadPlanetas) {
        this.cantidadPlanetas = cantidadPlanetas;
    }
    public void avisoCantidadFilas(){
        if(cantidadFilas > 10){
            System.out.println("\nNo pueden haber más de 10 Filas... \n¡Ingresa de nuevo la cantidad de Filas!");
        }else{
            System.out.println("\n   ***CANTIDAD REGISTRADA***" + "\n");
        }
    }
    public void avisoCantidadColumnas(){
        if(cantidadColumnas > 10){
            System.out.println("\nNo pueden haber más de 10 Columnas... \n¡Ingresa de nuevo la cantidad de Columnas!");
        }else{
            System.out.println("\n   ***CANTIDAD REGISTRADA***" + "\n");
        }
    }
    public void avisoPlaneta(){
        if(cantidadPlanetas > 8){
            System.out.println("\nNo pueden haber más de 8 planetas... \n¡Ingresa de nuevo la cantidad de planetas!");
        }else{
            System.out.println("\n   ***CANTIDAD REGISTRADA***");
        }
    }
    
    public void barraNumeroColumnas(){
        barraColumnas = new int[cantidadColumnas];
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_PURPLE = "\u001B[35m";
       // String ANSI_BLACK = "\u001B[30m";
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";        
        for (int i = 0; i < cantidadColumnas; i++) {
            if(i == 0){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "    |    " + "A" +"    " + ANSI_RESET);               
            }else if(i == 1){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "B" +"    " + ANSI_RESET);
            }else if(i == 2){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "C" +"    " + ANSI_RESET);
            }else if(i == 3){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "D" +"    " + ANSI_RESET);
            }else if(i == 4){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "E" +"    " + ANSI_RESET);
            }else if(i == 5){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "F" +"    " + ANSI_RESET);
            }else if(i == 6){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "G" +"    " + ANSI_RESET);
            }else if(i == 7){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "H" +"    " + ANSI_RESET);
            }else if(i == 8){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "I" +"    " + ANSI_RESET);
            }else if(i == 9){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "J" +"    " + ANSI_RESET);
            }else if(i == 10){
                System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "|    " + "K" +"    " + ANSI_RESET);
            }
        }
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_GREEN + "|" + ANSI_RESET);
    }
    
    //Determina donde en que espacio del arreglo aparecera planetas neutrales
    public int filaAleatoriaPares(){
        int filaAleatoria = (int) (Math.random() * cantidadFilas);
        if(filaAleatoria == 0){
            return filaAleatoria;
        }else if(filaAleatoria == 1){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 2){
           return filaAleatoria;
        }else if(filaAleatoria == 3){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 4){
            return filaAleatoria;
        }else if(filaAleatoria == 5){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 6){
            return filaAleatoria;
        }else if(filaAleatoria == 7){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 8){
        return filaAleatoria;
        }else if(filaAleatoria == 9){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 10){
            return filaAleatoria;
        }
        return filaAleatoria;
    }
    //Determina donde en que espacio del arreglo aparecera planetas neutrales

    public int columnaAleatoriaImpar(){
        int filaAleatoria = (int) (Math.random() * cantidadColumnas);
        if(filaAleatoria == 0){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 1){
            return filaAleatoria;
        }else if(filaAleatoria == 2){
           return filaAleatoria +1;
        }else if(filaAleatoria == 3){
            return filaAleatoria;
        }else if(filaAleatoria == 4){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 5){
            return filaAleatoria;
        }else if(filaAleatoria == 6){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 7){
            return filaAleatoria;
        }else if(filaAleatoria == 8){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 9){
            return filaAleatoria;
        }
        return filaAleatoria;
    }
    //Determina donde en que espacio del arreglo aparecera J1 

    public int filaAleatoriaImparesJ1(){
        int filaAleatoria = (int) (Math.random() * cantidadFilas);
        if(filaAleatoria == 0){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 1){
            return filaAleatoria;
        }else if(filaAleatoria == 2){
           return filaAleatoria + 1;
        }else if(filaAleatoria == 3){
            return filaAleatoria;
        }else if(filaAleatoria == 4){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 5){
            return filaAleatoria;
        }else if(filaAleatoria == 6){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 7){
            return filaAleatoria;
        }else if(filaAleatoria == 8){
        return filaAleatoria + 1;
        }else if(filaAleatoria == 9){
            return filaAleatoria;
        }
        return filaAleatoria;
    }
        //Determina donde en que espacio del arreglo aparecera J1 

    public int columnaAleatoriaParesJ1(){
        int filaAleatoria = (int) (Math.random() * cantidadColumnas);
        if(filaAleatoria == 0){
            return filaAleatoria;
        }else if(filaAleatoria == 1){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 2){
           return filaAleatoria;
        }else if(filaAleatoria == 3){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 4){
            return filaAleatoria;
        }else if(filaAleatoria == 5){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 6){
            return filaAleatoria;
        }else if(filaAleatoria == 7){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 8){
        return filaAleatoria;
        }else if(filaAleatoria == 9){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 10){
            return filaAleatoria;
        }
        return filaAleatoria;
    }
        //Determina donde en que espacio del arreglo aparecera J2 

    public int filaAleatoriaImparesJ2(){
        int filaAleatoria = (int) (Math.random() * cantidadFilas);
        if(filaAleatoria == 0){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 1){
            return filaAleatoria;
        }else if(filaAleatoria == 2){
           return filaAleatoria + 1;
        }else if(filaAleatoria == 3){
            return filaAleatoria;
        }else if(filaAleatoria == 4){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 5){
            return filaAleatoria;
        }else if(filaAleatoria == 6){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 7){
            return filaAleatoria;
        }else if(filaAleatoria == 8){
        return filaAleatoria + 1;
        }else if(filaAleatoria == 9){
            return filaAleatoria;
        }
        return filaAleatoria;
    }
    //Determina donde en que espacio del arreglo aparecera J2 
    public int columnaAleatoriaParesJ2(){
        int filaAleatoria = (int) (Math.random() * cantidadColumnas);
        if(filaAleatoria == 0){
            return filaAleatoria;
        }else if(filaAleatoria == 1){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 2){
           return filaAleatoria;
        }else if(filaAleatoria == 3){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 4){
            return filaAleatoria;
        }else if(filaAleatoria == 5){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 6){
            return filaAleatoria;
        }else if(filaAleatoria == 7){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 8){
        return filaAleatoria;
        }else if(filaAleatoria == 9){
            return filaAleatoria + 1;
        }else if(filaAleatoria == 10){
            return filaAleatoria;
        }
        return filaAleatoria;
    }
}
