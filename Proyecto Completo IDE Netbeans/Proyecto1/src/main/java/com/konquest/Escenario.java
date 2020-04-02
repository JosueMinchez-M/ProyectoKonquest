package com.konquest;

import com.konquest.diseñomapa.Agua;
import com.konquest.diseñomapa.Fuego;
import com.konquest.diseñomapa.Mapa;
import com.konquest.diseñomapa.Organico;
import com.konquest.diseñomapa.Planeta;
import com.konquest.diseñomapa.Radioactivo;
import com.konquest.diseñomapa.Tierra;
import com.konquest.jugador.Jugador;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author joshua
 */
public class Escenario{
    String comprobarPlaneta;
    int filas, columnas, planetas;
    String [][] tablero;
    //--------------------------
    Scanner in;
    private int numeroMenu;
    String nombrePlaneta, tipoPlaneta;
    int cantidadConstructores, cantidadNaves;
    double porcentajeMuerte, probabilidadDistribucion;
    //------------------------------------------------------
    // NUEVOS
    int randGuerrerosTierra = (int) Math.floor(Math.random()*(25-15+1)+15);
    int randGalactusTierra = (int) Math.floor(Math.random()*(100-50+1)+50);
    //tipoGuerrero, dineroProducido, probabilidadDistribucion, cantidadGuerreros
    Tierra tierra = new Tierra("TIERRA", "Mole", randGalactusTierra, 0.45, randGuerrerosTierra);
    int randGuerrerosAgua = (int) Math.floor(Math.random()*(23-12+1)+12);
    int randGalactusAgua = (int) Math.floor(Math.random()*(120-60+1)+60);
    Agua agua = new Agua("AGUA", "Nemo", randGalactusAgua, 0.25, randGuerrerosAgua);
    int randGuerrerosFuego = (int) Math.floor(Math.random()*(20-11+1)+11);
    int randGalactusFuego = (int) Math.floor(Math.random()*(140-70+1)+70);
    Fuego fuego = new Fuego("FUEGO", "Magma", randGalactusFuego, 0.15, randGuerrerosFuego);
    int randGuerrerosOrganico = (int) Math.floor(Math.random()*(15-5+1)+5);
    int randGalactusOrganico = (int) Math.floor(Math.random()*(160-80+1)+80);
    Organico organico = new Organico("ORGANICO", "Groot", randGalactusOrganico, 0.10, randGuerrerosOrganico);
    int randGuerrerosRadioactivo = (int) Math.floor(Math.random()*(9-3+1)+3);
    int randGalactusRadioactivo = (int) Math.floor(Math.random()*(180-90+1)+90);
    Radioactivo radioactivo = new Radioactivo("RADIOACTIVO", "Fision Guy", randGalactusRadioactivo, 0.05, randGuerrerosRadioactivo);
    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();
    Mapa mapa = new Mapa();
    Planeta p1 = new Planeta(); Planeta p2 = new Planeta(); Planeta p3 = new Planeta(); Planeta p4 = new Planeta(); 
    Planeta p5 = new Planeta(); Planeta p6 = new Planeta();Planeta p7 = new Planeta(); Planeta p8 = new Planeta();
    Planeta pJ1 = new Planeta(); Planeta pJ2 = new Planeta();
    DecimalFormat decimal = new DecimalFormat("#0.0000");
    Almacen almacen = new Almacen();
    //---------------------------------------------
    int coordenadaFila, coordenadaColumna, distanciaOrigenFilaJ1, distanciaOrigenColumnaJ1, distanciaDestinoFilaJ1,distanciaDestinoColumnaJ1;
    int distanciaOrigenFilaJ2, distanciaOrigenColumnaJ2, distanciaDestinoFilaJ2, distanciaDestinoColumnaJ2;
    //---------------------------------------------
    String letraCoordenadaColumna, distanciaOrigenColumna, distanciaDestinoColumna;
    public Escenario(){
        this.in = new Scanner(System.in);
    }
    
    
    // Informacion seleccion aleatoria Planetas
    public void infoSelAleatoriaPlanetas(){
        String [] cadena = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C"};
        int aleatorioString = (int) (Math.random()*22);
        probabilidadDistribucion = Math.random()* 0.45;// generamos un numero al azar entre 0 y 0.45
        nombrePlaneta = cadena[aleatorioString];
        cantidadConstructores = 1;
        cantidadNaves = (int) Math.floor(Math.random()*(3-1+1)+1);
        double porcentajeMuerteCompleto =  (Math.random()*(0.9999-0.1)+0.1);
        porcentajeMuerte = Double.parseDouble(decimal.format(porcentajeMuerteCompleto));
        coordenadaFila = mapa.filaAleatoriaPares();
        coordenadaColumna = mapa.columnaAleatoriaImpar();
    }// Informacion Seleccion Propia Planetas
    public void infoSelPropiaPlanetas(){
        System.out.print("-> Ingrese el Nombre (Solo puede ser una Letra del Alfabeto): ");
        nombrePlaneta = in.nextLine();
        System.out.print("-> Ingrese Cantidad de Constructores: ");
        cantidadConstructores = Integer.parseInt(in.nextLine());
        System.out.print("-> Ingrese Cantidad de Naves: ");
        cantidadNaves = Integer.parseInt(in.nextLine());
        double porcentajeMuerteCompleto =  (Math.random()*(0.9999-0.1)+0.1);
        porcentajeMuerte = Double.parseDouble(decimal.format(porcentajeMuerteCompleto));
        coordenadaFila = mapa.filaAleatoriaPares();
        coordenadaColumna = mapa.columnaAleatoriaImpar();
        probabilidadDistribucion = Math.random()* 0.45;// generamos un numero al azar entre 0 y 0.45
    }//Informacion aleatoria planeta Jugadores
    public void infoSelAleatorioPlanetaJugadores(){
        cantidadConstructores = 1;
        cantidadNaves = (int) Math.floor(Math.random()*(3-1+1)+1);
        double porcentajeMuerteCompleto =  (Math.random()*(0.9999-0.1)+0.1);
        porcentajeMuerte = Double.parseDouble(decimal.format(porcentajeMuerteCompleto));
        coordenadaFila = mapa.filaAleatoriaPares();
        coordenadaColumna = mapa.columnaAleatoriaImpar();
        probabilidadDistribucion = Math.random()* 0.45;// generamos un numero al azar entre 0 y 0.45
    }//informacion selecion propia planeta Jugadores
    public void infoSelPropiaPlanetaJugadores(){
        System.out.print("-> Ingrese Cantidad de Constructores: ");
        cantidadConstructores = Integer.parseInt(in.nextLine());
        System.out.print("-> Ingrese Cantidad de Naves: ");
        cantidadNaves = Integer.parseInt(in.nextLine());
        double porcentajeMuerteCompleto =  (Math.random()*(0.9999-0.1)+0.1);
        porcentajeMuerte = Double.parseDouble(decimal.format(porcentajeMuerteCompleto));
        coordenadaFila = mapa.filaAleatoriaPares();
        coordenadaColumna = mapa.columnaAleatoriaImpar();
        probabilidadDistribucion = Math.random()* 0.45;// generamos un numero al azar entre 0 y 0.45
    }
    public void opcionSeleccion(){
        System.out.println("\n1. Seleccion aleatoria \n2. Seleccion Propia");
        System.out.println("\nIngresa el numero de la opcion que deseas realizar:");
        numeroMenu = Integer.parseInt(this.in.nextLine());
    }
    //Pedir datos Aleatorios o Fijo del tablero
    public void tableroAleatorio(){
        System.out.print("-> Registro Automático de 7 Filas...");
        do{
        filas = 7;
        mapa = new Mapa(filas, columnas, planetas);
        mapa.avisoCantidadFilas();
        }while(filas > 10);
        System.out.print("-> Registro Automático de 8 Columnas...");
        do{
        columnas = 8;
        mapa = new Mapa(filas, columnas, planetas);
        mapa.avisoCantidadColumnas();
        }while(columnas > 10);
        System.out.print("-> Registro Automático de 5 Planetas... ");
        do{
            planetas = 5;
            mapa = new Mapa(filas, columnas, planetas);
            mapa.avisoPlaneta();
        }while(planetas > 8);
    }
    //Pedir datos que el juegador quiere ingresar para tamaño del tablero
    public void tableroPropio(){
        System.out.print("-> Ingresen número de Filas: ");
        do{
        filas = Integer.parseInt(this.in.nextLine());
        mapa = new Mapa(filas, columnas, planetas);
        mapa.avisoCantidadFilas();
        }while(filas > 10);
        System.out.print("-> Ingresen número de Columnas: ");
        do{
        columnas = Integer.parseInt(this.in.nextLine());
        mapa = new Mapa(filas, columnas, planetas);
        mapa.avisoCantidadColumnas();
        }while(columnas > 10);
        System.out.print("-> Ingresen número de Planetas (Máximo 8 Planetas): ");
        do{
            planetas = Integer.parseInt(this.in.nextLine());
            mapa = new Mapa(filas, columnas, planetas);
            mapa.avisoPlaneta();
            //mapa.crearMapa();
        }while(planetas > 8);
    }
    public void infoUsuarios(){
        System.out.println("----------------------------");
        System.out.println("|||>BIENVENIDO A KONQUES<|||");
        System.out.println("----------------------------");
        // Crea la matriz y a su vez el tablero (MAPA)
        System.out.println("-----------------");
        System.out.println("|DISEÑO DEL MAPA|");
        System.out.println("-----------------");
        System.out.println("\n---CREAR MAPA---");
        System.out.println("\n1. Crear Tablero Aleatorio \n2. Crear Tablero Propio \nIngresa el numero de la opcion que deseas realizar: ");
        numeroMenu = Integer.parseInt(in.nextLine());
        switch(numeroMenu){
            case 1://Mapa Aleatorio
                tableroAleatorio();
                break;
            case 2://Mapa Propio
                tableroPropio();
                break;
        }//Solicitud nombre Jugador 1
        System.out.print("\n-> PRIMER JUGADOR \nIngresa el nombre que quieres usar: ");
        String Jugador1 = in.nextLine();
        System.out.println("\n-> "+ Jugador1 +" INGRESA CANTIDAD DE GALACTUS: ");
        System.out.println("\n1. Seleccion aleatoria \n2. Seleccion Propia");
        System.out.println("\nIngresa el numero de la opcion que deseas realizar:");
        numeroMenu = Integer.parseInt(in.nextLine());
        switch(numeroMenu){
        case 1:// Seleccion aleatoria galactus Jugador1
            int randGalactus = (int) Math.floor(Math.random()*(500-100+1)+100);
            j1 = new Jugador(Jugador1, randGalactus);
            j1.printJugadorGalactus();
            break;
        case 2:// Seleccion propia galactus Jugador1
            System.out.println("Ingresa la Cantidad: ");
            int galactus = Integer.parseInt(in.nextLine());
            j1 = new Jugador(Jugador1, galactus);
            j1.printJugadorGalactus();
            break;
        default:
            System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
            break;
        }
        System.out.println("\n---| " + j1.getNombre() + " CREA TU PLANETA |---");
        opcionSeleccion();
        switch(numeroMenu){
            case 1://Seleccion Aleatoria
                //Registro Automatico del Planeta
                System.out.println("Registro Automático del Nombre de tu Planeta: J1");
                nombrePlaneta = "J1";
                infoSelAleatorioPlanetaJugadores();
                pJ1 = new Planeta(nombrePlaneta, porcentajeMuerte,
                cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                System.out.println("\n***PLANETA REGISTRADO***");
                break;
            case 2://Seleccion Propia
                System.out.println("Registro Automático del Nombre de tu Planeta: J1");
                nombrePlaneta = "J1";
                infoSelPropiaPlanetaJugadores();
                pJ1 = new Planeta(nombrePlaneta, porcentajeMuerte,
                cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                break;
            default:
                System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                break;
        }
        //Datos que se le piden al Jugador 2
        System.out.print("\n-> SEGUNDO JUGADOR \nIngresa el nombre que quieres usar: ");
        String Jugador2 = in.nextLine();
        System.out.println("\n-> " + Jugador2 + " INGRESA CANTIDAD DE GALACTUS: ");
        System.out.println("\n1. Seleccion aleatoria \n2. Seleccion Propia");
        System.out.println("\nIngresa el numero de la opcion que deseas realizar:");
        numeroMenu = Integer.parseInt(in.nextLine());
        switch(numeroMenu){
            case 1:// Seleccion aleatoria galactus Jugador1
                int randGalactus = (int) Math.floor(Math.random()*(500-100+1)+100);
                j2 = new Jugador(Jugador2, randGalactus);
                j2.printJugadorGalactus();
                break;
            case 2:// Seleccion propia galactus Jugador1
                System.out.println("Ingresa la Cantidad: ");
                int galactus = Integer.parseInt(in.nextLine());
                j2 = new Jugador(Jugador2, galactus);
                j2.printJugadorGalactus();
                break;
            default:
                System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                break;
                
        }
        //Crear Planetas de Jugador 2
        System.out.println("\n---| " + j2.getNombre() + " CREA TU PLANETA |---");
        opcionSeleccion();
        switch(numeroMenu){
            case 1://Seleccion Aleatoria
                System.out.println("Registro Automático del Nombre de tu Planeta: J2");
                nombrePlaneta = "J2";
                infoSelAleatorioPlanetaJugadores();
                pJ2 = new Planeta(nombrePlaneta, porcentajeMuerte,
                cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                System.out.println("\n***PLANETA REGISTRADO***");
                break;
            case 2://Seleccion Propia
                System.out.println("Registro Automático del Nombre de tu Planeta: J2");
                nombrePlaneta = "J2";
                infoSelPropiaPlanetaJugadores();
                pJ2 = new Planeta(nombrePlaneta, porcentajeMuerte,
                cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                break;
            default:
                System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                break;
        }
        //Ejecuta las opciones de Crear de forma ALEATORIA o PROPIA el mapa registra las coordenadas del planeta
        System.out.println("\n---CREAR PLANETAS---");
        for (int i = 1; i <= planetas; i++) {
            if(i == 1){//Creacion del Planeta 1
                System.out.println("\n-> PLANETA 1:");
                opcionSeleccion();
                switch(numeroMenu){
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p1 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p1 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
            }else if(i == 2){
                System.out.println("\n-> PLANETA 2:");
                opcionSeleccion();
                switch(numeroMenu){//Creacion del planeta 2
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p2 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        probabilidadDistribucion = Math.random()* 0.45;// generamos un numero al azar entre 0 y 0.45
                        infoSelPropiaPlanetas();
                        p2 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
            }else if(i == 3){
                System.out.println("\n-> PLANETA 3:");
                opcionSeleccion();
                switch(numeroMenu){//Creacion del planeta 3
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p3 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p3 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }                
            }else if(i == 4){
                System.out.println("\n-> PLANETA 4:");
                opcionSeleccion();
                switch(numeroMenu){//Creacion del planeta 4
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p4 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p4 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }               
            }else if(i == 5){
                System.out.println("\n-> PLANETA 5:");
                opcionSeleccion();
                switch(numeroMenu){//Creacion del planeta 5
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p5 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p5 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }                
            }else if(i == 6){
                System.out.println("\n-> PLANETA 6:");
                opcionSeleccion();
                switch(numeroMenu){//Creacion del planea 6
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p6 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p6 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
            }else if(i == 7){
                System.out.println("\n-> PLANETA 7:");
                opcionSeleccion();
                switch(numeroMenu){//Creacion del Planeta 7
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p7 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p7 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
                
            }else if(i == 8){
                System.out.println("\n-> PLANETA 8:");
                opcionSeleccion();
                switch(numeroMenu){// Creacion del Planeta 8
                    case 1://Seleccion Aleatoria
                        infoSelAleatoriaPlanetas();
                        p8 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        System.out.println("\n***PLANETA REGISTRADO***");
                        break;
                    case 2://Seleccion Propia
                        infoSelPropiaPlanetas();
                        p8 = new Planeta(nombrePlaneta, porcentajeMuerte,
                        cantidadConstructores, cantidadNaves, coordenadaFila, coordenadaColumna, probabilidadDistribucion);
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
                
            }
            
        }// INicio del JUego
        System.out.println("\n|||-------------------- INICIA JUEGO --------------------|||" + "\n");
        System.out.println("Terreno de juego terminado...");
        //Muestra el tablero terminado ya con los planetas y coordenadas registrados
        terrenoJuego();
        boolean salirJ1 = false;
        while(!salirJ1){
        System.out.println("\n¿" + j1.getNombre() + " QUE QUIERES HACER?");
        //terrenoJuego();
        System.out.println("\n1. Medir Distancia entre Planetas \n2. Datos del Planeta (Neutrales o Propios) \n3. Consultar Flota \n4. Enviar Flota "
                + "\n5. Construir Nave \n6. Tienda \n7. Finalizar Accion \n8. Salir "
                + "\nIngresa el numero de la opcion que deseas realizar:");
        numeroMenu = Integer.parseInt(in.nextLine());
        switch(numeroMenu){
            case 1://Medir Distancia Entre Planetas
                System.out.println("\n-----|||DISTANCIA DE TU PLANETA A LOS PLANETAS NEUTRALES (RECUERDA TU PLANETA ES DE COLOR VERDE) |||-----");
                terrenoJuego();
                System.out.println("\n-----Coordenadas Planeta Origen-----");
                System.out.print("Ingresa la Fila: ");
                distanciaOrigenFilaJ1 = Integer.parseInt(in.nextLine());
                System.out.print("Ingresa la Columna: ");
                //distanciaOrigenColumnaJ1 = Integer.parseInt(in.nextLine());
                distanciaOrigenColumna = in.nextLine();
                System.out.println("\n-----Coordenadas Planeta Destino-----");
                System.out.print("Ingresa la Fila: ");
                distanciaDestinoFilaJ1 = Integer.parseInt(in.nextLine());
                System.out.print("Ingresa la Columna: ");
                distanciaDestinoColumna = in.nextLine();
                medirDistanciaEntrePlanetasJ1();
                break;
            case 2:// Datos Planetas
                System.out.println("----|| DATOS PLANETAS ||----");
                System.out.println("\n1. Planetas Neutrales \n2. Planetas Propios o Conquistados \nIngresa el numero de la opcion que deseas realizar:");
                numeroMenu = Integer.parseInt(in.nextLine());
                switch(numeroMenu){
                    case 1:// Planetas Neutrales
                        pedirCoordenadas();
                        mostrarDatosPlanetasNeutrales();
                        break;
                    case 2: //Planetas Propios
                        System.out.println("\n-------|||||RECUERDA " + j1.getNombre() + " TU PLANETA ES DE COLOR VERDE|||||-------");
                        pedirCoordenadas();
                        mostrarDatosPlanetasJ1();
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
                break;
            case 3:// Consultar Flota
                break;
            case 4:// Enviar Flota
                break;
            case 5:// Construir Nave
                break;
            case 6://Tienda
                break;
            case 7://Finalizar Acción 
                break;
            case 8://Salir
                salirJ1 = true;
                break;
            default:
                System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                break;
        }
    }
        boolean salirJ2 = false;
        while(!salirJ2){
        System.out.println("\n¿" + j2.getNombre() + " QUE QUIERES HACER?");
        //terrenoJuego();
        System.out.println("\n1. Medir Distancia entre Planetas \n2. Datos del Planeta (Neutrales o Propios) \n3. Consultar Flota \n4. Enviar Flota "
                + "\n5. Construir Nave \n6. Tienda \n7. Finalizar Accion \n8. Salir "
                + "\nIngresa el numero de la opcion que deseas realizar:");
        numeroMenu = Integer.parseInt(in.nextLine());
        switch(numeroMenu){
            case 1:
                System.out.println("\n-----|||DISTANCIA DE TU PLANETA A LOS PLANETAS NEUTRALES (RECUERDA TU PLANETA ES DE COLOR MORADO) |||-----");
                terrenoJuego();
                System.out.println("\n-----Coordenadas Planeta Origen-----");
                System.out.print("Ingresa la Fila: ");
                distanciaOrigenFilaJ2 = Integer.parseInt(in.nextLine());
                System.out.print("Ingresa la Columna: ");
                //distanciaOrigenColumnaJ1 = Integer.parseInt(in.nextLine());
                distanciaOrigenColumna = in.nextLine();
                System.out.println("\n-----Coordenadas Planeta Destino-----");
                System.out.print("Ingresa la Fila: ");
                distanciaDestinoFilaJ2 = Integer.parseInt(in.nextLine());
                System.out.print("Ingresa la Columna: ");
                //distanciaDestinoColumnaJ1 = Integer.parseInt(in.nextLine());
                distanciaDestinoColumna = in.nextLine();
                medirDistanciaEntrePlanetasJ2();
                break;
            case 2: 
                System.out.println("----|| DATOS PLANETAS (PROPIOS O CONQUISTADOS) ||----");
                System.out.println("\n1. Planetas Neutrales \n2. Planetas Propios o Conquistados \nIngresa el numero de la opcion que deseas realizar:");
                numeroMenu = Integer.parseInt(in.nextLine());
                switch(numeroMenu){
                    case 1:// Planetas Neutrales
                        pedirCoordenadas();
                        mostrarDatosPlanetasNeutrales();
                        break;
                    case 2: //Planetas Propio
                        System.out.println("\n-------|||||RECUERDA " + j2.getNombre() + " TU PLANETA ES DE COLOR MORADO|||||-------");
                        pedirCoordenadas();
                        mostrarDatosPlanetasJ2();
                        break;
                    default:
                        System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                        break;
                }
                break;
            case 3: //Consultar FLota
                break;
            case 4: // Enviar Flota
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                salirJ2 = true;
                break;
            default:
                System.out.println("\nSeleccion incorrecta... Ingresa un numero valido");
                break;
        }
    }
    }
    int rdm1 = (int) (Math.random()*3);
    int rdm2 = (int) (Math.random()*3);
    int rdm3 = (int) (Math.random()*3);
    int rdm4 = (int) (Math.random()*3);
    int rdm5 = (int) (Math.random()*3);
    int rdm6 = (int) (Math.random()*3);
    int rdm7 = (int) (Math.random()*3);
    int rdm8 = (int) (Math.random()*3);
    
    public void medirDistanciaEntrePlanetasJ1(){
        String [] cadena = new String[3];
        cadena [0] = "\nDISTANCIA: 1 AÑOS LUZ";
        cadena [1] = "\nDISTANCIA: 2 AÑOS LUZ";
        cadena [2] = "\nDISTANCIA: 3 AÑOS LUZ";
        int coordenadaColumnaOrigen = cambioLetraNumeroDestino();
        if(distanciaDestinoFilaJ1 == p1.getCoordenadaFilaX() && coordenadaColumnaOrigen == p1.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm1]);
        }else if(distanciaDestinoFilaJ1 == p2.getCoordenadaFilaX() && coordenadaColumnaOrigen == p2.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm2]);
        }else if(distanciaDestinoFilaJ1 == p3.getCoordenadaFilaX() && coordenadaColumnaOrigen == p3.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm3]);
        }else if(distanciaDestinoFilaJ1 == p4.getCoordenadaFilaX() && coordenadaColumnaOrigen == p4.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm4]);
        }else if(distanciaDestinoFilaJ1 == p5.getCoordenadaFilaX() && coordenadaColumnaOrigen == p5.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm5]);
        }else if(distanciaDestinoFilaJ1 == p6.getCoordenadaFilaX() && coordenadaColumnaOrigen == p6.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm6]);
        }else if(distanciaDestinoFilaJ1 == p7.getCoordenadaFilaX() && coordenadaColumnaOrigen == p7.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm7]);
        }else if(distanciaDestinoFilaJ1 == p8.getCoordenadaFilaX() && coordenadaColumnaOrigen == p8.getCoordenadaColumnaY()){
           System.out.println(cadena[rdm8]);
        }
    }
    
    public void medirDistanciaEntrePlanetasJ2(){
        String [] cadena = new String[3];
        cadena [0] = "\nDISTANCIA: 1 AÑOS LUZ";
        cadena [1] = "\nDISTANCIA: 2 AÑOS LUZ";
        cadena [2] = "\nDISTANCIA: 3 AÑOS LUZ";
        int coordenadaColumnaOrigen = cambioLetraNumeroDestino();
        if(distanciaDestinoFilaJ2 == p1.getCoordenadaFilaX() && coordenadaColumnaOrigen == p1.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm1]);
        }else if(distanciaDestinoFilaJ2 == p2.getCoordenadaFilaX() && coordenadaColumnaOrigen == p2.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm2]);
        }else if(distanciaDestinoFilaJ2 == p3.getCoordenadaFilaX() && coordenadaColumnaOrigen == p3.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm3]);
        }else if(distanciaDestinoFilaJ2 == p4.getCoordenadaFilaX() && coordenadaColumnaOrigen == p4.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm4]);
        }else if(distanciaDestinoFilaJ2 == p5.getCoordenadaFilaX() && coordenadaColumnaOrigen == p5.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm5]);
        }else if(distanciaDestinoFilaJ2 == p6.getCoordenadaFilaX() && coordenadaColumnaOrigen == p6.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm6]);
        }else if(distanciaDestinoFilaJ2 == p7.getCoordenadaFilaX() && coordenadaColumnaOrigen == p7.getCoordenadaColumnaY()){
            System.out.println(cadena[rdm7]);
        }else if(distanciaDestinoFilaJ2 == p8.getCoordenadaFilaX() && coordenadaColumnaOrigen == p8.getCoordenadaColumnaY()){
           System.out.println(cadena[rdm8]);
        }
    }
    public int cambioLetraNumeroDestino(){
        int numero = 0;
        if(distanciaDestinoColumna.equalsIgnoreCase("A")){
            numero = 0;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("B")){
            numero = 1;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("C")){
            numero = 2;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("D")){
            numero = 3;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("E")){
            numero = 4;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("F")){
            numero = 5;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("G")){
            numero = 6;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("H")){
            numero = 7;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("I")){
            numero = 8;
        }else if(distanciaDestinoColumna.equalsIgnoreCase("J")){
            numero = 9;
        }
        return numero;
    }
    public void pedirCoordenadas(){
        System.out.println("\n----INGRESA LAS COORDENADAS DEL PLANETA----");
        terrenoJuego();
        System.out.print("\nIngresa la Fila: ");
        coordenadaFila = Integer.parseInt(in.nextLine());
        System.out.print("Ingresa la Columna: ");
        letraCoordenadaColumna = in.nextLine();
        System.out.println("Coordenadas del Planeta: ( " + coordenadaFila + " , " + letraCoordenadaColumna + " )");
    }
    
    public void mostrarDatosPlanetasJ1(){
        int coordenadaColumnaJ1 = cambioLetraNumero();
        if(coordenadaFila == pJ1.getCoordenadaFilaX() && coordenadaColumnaJ1 == pJ1.getCoordenadaColumnaY()){
            probabilidadTipoPlanetaJ1();
            pJ1.printMe();
        }
        
    }   
    public void mostrarDatosPlanetasJ2(){
        int coordenadaColumnaJ2 = cambioLetraNumero();
        if(coordenadaFila == pJ2.getCoordenadaFilaX() && coordenadaColumnaJ2 == pJ2.getCoordenadaColumnaY()){
            probabilidadTipoPlanetaJ2();
            pJ2.printMe();
        }
        
    }
    public void probabilidadTipoPlanetaJ1(){
        if(pJ1.getProbabilidadDistribucion() > 0.25 && pJ1.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(pJ1.getProbabilidadDistribucion() > 0.15 && pJ1.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(pJ1.getProbabilidadDistribucion() > 0.10 && pJ1.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(pJ1.getProbabilidadDistribucion() > 0.05 && pJ1.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(pJ1.getProbabilidadDistribucion() >= 0 && pJ1.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlanetaJ2(){
        if(pJ2.getProbabilidadDistribucion() > 0.25 && pJ2.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(pJ2.getProbabilidadDistribucion() > 0.15 && pJ2.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(pJ2.getProbabilidadDistribucion() > 0.10 && pJ2.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(pJ2.getProbabilidadDistribucion() > 0.05 && pJ2.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(pJ2.getProbabilidadDistribucion() >= 0 && pJ2.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta1(){
        if(p1.getProbabilidadDistribucion() > 0.25 && p1.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p1.getProbabilidadDistribucion() > 0.15 && p1.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p1.getProbabilidadDistribucion() > 0.10 && p1.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p1.getProbabilidadDistribucion() > 0.05 && p1.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p1.getProbabilidadDistribucion() >= 0 && p1.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta2(){
        if(p2.getProbabilidadDistribucion() > 0.25 && p2.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p2.getProbabilidadDistribucion() > 0.15 && p2.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p2.getProbabilidadDistribucion() > 0.10 && p2.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p2.getProbabilidadDistribucion() > 0.05 && p2.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p2.getProbabilidadDistribucion() >= 0 && p2.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta3(){
        if(p3.getProbabilidadDistribucion() > 0.25 && p3.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p3.getProbabilidadDistribucion() > 0.15 && p3.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p3.getProbabilidadDistribucion() > 0.10 && p3.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p3.getProbabilidadDistribucion() > 0.05 && p3.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p3.getProbabilidadDistribucion() >= 0 && p3.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta4(){
        if(p4.getProbabilidadDistribucion() > 0.25 && p4.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p4.getProbabilidadDistribucion() > 0.15 && p4.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p4.getProbabilidadDistribucion() > 0.10 && p4.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p4.getProbabilidadDistribucion() > 0.05 && p4.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p4.getProbabilidadDistribucion() >= 0 && p4.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta5(){
        if(p5.getProbabilidadDistribucion() > 0.25 && p5.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p5.getProbabilidadDistribucion() > 0.15 && p5.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p5.getProbabilidadDistribucion() > 0.10 && p5.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p5.getProbabilidadDistribucion() > 0.05 && p5.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p5.getProbabilidadDistribucion() >= 0 && p5.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta6(){
        if(p6.getProbabilidadDistribucion() > 0.25 && p6.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p6.getProbabilidadDistribucion() > 0.15 && p6.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p6.getProbabilidadDistribucion() > 0.10 && p6.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p6.getProbabilidadDistribucion() > 0.05 && p6.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p6.getProbabilidadDistribucion() >= 0 && p6.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta7(){
        if(p7.getProbabilidadDistribucion() > 0.25 && p7.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p7.getProbabilidadDistribucion() > 0.15 && p7.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p7.getProbabilidadDistribucion() > 0.10 && p7.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p7.getProbabilidadDistribucion() > 0.05 && p7.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p7.getProbabilidadDistribucion() >= 0 && p7.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void probabilidadTipoPlaneta8(){
        if(p8.getProbabilidadDistribucion() > 0.25 && p8.getProbabilidadDistribucion() <=0.45){
            System.out.println("\n" + tierra.getNombrePlaneta());
        }else if(p8.getProbabilidadDistribucion() > 0.15 && p8.getProbabilidadDistribucion() <= 0.25){
            System.out.println("\n" + agua.getNombrePlaneta());
        }else if(p8.getProbabilidadDistribucion() > 0.10 && p8.getProbabilidadDistribucion() <= 0.15){
            System.out.println("\n" + fuego.getNombrePlaneta());
        }else if(p8.getProbabilidadDistribucion() > 0.05 && p8.getProbabilidadDistribucion() <= 0.10){
            System.out.println("\n" + organico.getNombrePlaneta());
        }else if(p8.getProbabilidadDistribucion() >= 0 && p8.getProbabilidadDistribucion() <= 0.05){
        }
    }
    public void mostrarDatosPlanetasNeutrales(){
        int coordenadaColumna = cambioLetraNumero();
        if(coordenadaFila == p1.getCoordenadaFilaX() && coordenadaColumna == p1.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta1();
            p1.printMe();
        }else if(coordenadaFila == p2.getCoordenadaFilaX() && coordenadaColumna == p2.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta2();
            p2.printMe();
        }else if(coordenadaFila == p3.getCoordenadaFilaX() && coordenadaColumna == p3.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta3();
            p3.printMe();
        }else if(coordenadaFila == p4.getCoordenadaFilaX() && coordenadaColumna == p4.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta4();
            p4.printMe();
        }else if(coordenadaFila == p5.getCoordenadaFilaX() && coordenadaColumna == p5.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta5();
            p5.printMe();
        }else if(coordenadaFila == p6.getCoordenadaFilaX() && coordenadaColumna == p6.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta6();
            p6.printMe();
        }else if(coordenadaFila == p7.getCoordenadaFilaX() && coordenadaColumna == p7.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta7();
            p7.printMe();
        }else if(coordenadaFila == p8.getCoordenadaFilaX() && coordenadaColumna == p8.getCoordenadaColumnaY()){
            probabilidadTipoPlaneta8();
            p8.printMe();
        }
    }
    public int cambioLetraNumero(){
        int numero = 0;
        if(letraCoordenadaColumna.equalsIgnoreCase("A")){
            numero = 0;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("B")){
            numero = 1;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("C")){
            numero = 2;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("D")){
            numero = 3;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("E")){
            numero = 4;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("F")){
            numero = 5;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("G")){
            numero = 6;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("H")){
            numero = 7;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("I")){
            numero = 8;
        }else if(letraCoordenadaColumna.equalsIgnoreCase("J")){
            numero = 9;
        }
        return numero;
    }
    // Se ejecuta la matriz y se pintan las casillas
    public void terrenoJuego(){
        tablero = new String[filas][columnas];
        //Pinta simbolo o caracter
        String ANSI_RESET = "\u001B[0m";
        String ANSI_PURPLE = "\u001B[35m";
        //Pinta fondo
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        mapa.barraNumeroColumnas();
        posicionJugador1();
        posicionJugador2();
        for (int i = 0; i < planetas; i++) {
            if(i == 0){
                posicionPlanetaNeutral1();
            }else if(i == 1){
                posicionPlanetaNeutral2();
            }else if(i == 2){
                posicionPlanetaNeutral3();
            }else if(i == 3){
                posicionPlanetaNeutral4();
            }else if(i == 4){
                posicionPlanetaNeutral5();
            }else if(i == 5){
                posicionPlanetaNeutral6();
            }else if(i == 6){
                posicionPlanetaNeutral7();
            }else if(i == 7){
                posicionPlanetaNeutral8();
            }
        }
        for (int i = 0; i < filas; i++) {
            //Columnas del nombre-numero de filas
            System.out.print(ANSI_WHITE_BACKGROUND + ANSI_PURPLE + "| " + i +" " + ANSI_RESET);
            for (int j = 0; j < columnas; j++) {
                if(tablero[i][j] == null){
                    System.out.print(ANSI_BLUE_BACKGROUND +"|_________"); 
                }else if(tablero[i][j] != null){
                    System.out.print(tablero[i][j]);
                    //System.out.print("|" + ANSI_RED_BACKGROUND + "____" + tablero[i][j] + "____");
                } 
            }
            System.out.println(ANSI_BLUE_BACKGROUND + "|" + ANSI_RESET);            
        }        
    }
    public String arrNombrePlanetaNeutral(){
        int aleatorio = (int) (Math.random() * planetas);
        //int [] arregloNumeros = new int [8];
        String [] arreglo = new String[8];
        arreglo [0] = p1.getNombre();
        arreglo [1] = p2.getNombre();
        arreglo [2] = p3.getNombre();
        arreglo [3] = p4.getNombre();
        arreglo [4] = p5.getNombre();
        arreglo [5] = p6.getNombre();
        arreglo [6] = p7.getNombre();
        arreglo [7] = p8.getNombre();
        return arreglo[aleatorio];
        
    }
    public void posicionPlanetaNeutral1(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p1.getCoordenadaFilaX()][p1.getCoordenadaColumnaY()] == null) {
            tablero[p1.getCoordenadaFilaX()][p1.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p1.getNombre() + "____" + ANSI_RESET;
        }
    }
    public void posicionPlanetaNeutral2(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p2.getCoordenadaFilaX()][p2.getCoordenadaColumnaY()] == null) {
            tablero[p2.getCoordenadaFilaX()][p2.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p2.getNombre() + "____" + ANSI_RESET;
        }      
    }
    public void posicionPlanetaNeutral3(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p3.getCoordenadaFilaX()][p3.getCoordenadaColumnaY()] == null) {
            tablero[p3.getCoordenadaFilaX()][p3.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p3.getNombre() + "____" + ANSI_RESET;
        }    
    }
    public void posicionPlanetaNeutral4(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p4.getCoordenadaFilaX()][p4.getCoordenadaColumnaY()] == null) {
            tablero[p4.getCoordenadaFilaX()][p4.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p4.getNombre() + "____" + ANSI_RESET;
        }        
    }
    public void posicionPlanetaNeutral5(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p5.getCoordenadaFilaX()][p5.getCoordenadaColumnaY()] == null) {
            tablero[p5.getCoordenadaFilaX()][p5.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p5.getNombre() + "____" + ANSI_RESET;
        }
    }
    public void posicionPlanetaNeutral6(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p6.getCoordenadaFilaX()][p6.getCoordenadaColumnaY()] == null) {
            tablero[p6.getCoordenadaFilaX()][p6.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p6.getNombre() + "____" + ANSI_RESET;
        }
    }
    public void posicionPlanetaNeutral7(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p7.getCoordenadaFilaX()][p7.getCoordenadaColumnaY()] == null) {
            tablero[p7.getCoordenadaFilaX()][p7.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p7.getNombre() + "____" + ANSI_RESET;
        }
    }
    public void posicionPlanetaNeutral8(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        if (tablero[p8.getCoordenadaFilaX()][p8.getCoordenadaColumnaY()] == null) {
            tablero[p8.getCoordenadaFilaX()][p8.getCoordenadaColumnaY()] = "|" + ANSI_RED_BACKGROUND + ANSI_WHITE +  "____" + p8.getNombre() + "____" + ANSI_RESET;
        }        
    }
    public void posicionJugador1(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        if (tablero[pJ1.getCoordenadaFilaX()][pJ1.getCoordenadaColumnaY()] == null) {
            tablero[pJ1.getCoordenadaFilaX()][pJ1.getCoordenadaColumnaY()] = "|" + ANSI_GREEN_BACKGROUND + ANSI_WHITE +  "___" + pJ1.getNombre() + "____" + ANSI_RESET;
        }
    }
    public void posicionJugador2(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        if (tablero[pJ2.getCoordenadaFilaX()][pJ2.getCoordenadaColumnaY()] == null) {
            tablero[pJ2.getCoordenadaFilaX()][pJ2.getCoordenadaColumnaY()] = "|" + ANSI_PURPLE_BACKGROUND + ANSI_WHITE +  "___" + pJ2.getNombre() + "____" + ANSI_RESET;
        }
    }
    public void encabezadoBienvenidaKonquest(){
        System.out.println("\n---------------------------------");
        System.out.println("|||>>>BIENVENIDO A KONQUEST<<<|||");
        System.out.println("---------------------------------");
    }
    
    public void encabezadoDiseñoMapa(){
        System.out.println("\n------------------");
        System.out.println("| DISEÑO DE MAPA |");
        System.out.println("------------------");
    }
    
    public void encabezadoCrearMapa(){
        System.out.println("\n--------------");
        System.out.println("| CREAR MAPA |");
        System.out.println("--------------");
    }
    
    public void encabezadoCrearPlanetas(){
        System.out.println("\n------------------");
        System.out.println("| CREAR PLANETAS |");
        System.out.println("------------------");
    }
    
}
