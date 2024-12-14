package Aplicacion;

import Libreria.Bateria;

public class pruebaBateria{
    public static void main(String[] args){
    
        int nroSerie = 1;
        float capMaxima = 1000;
        float disponibilidad = 1000;
    
        Bateria objBateria = new Bateria();
    
        objBateria.setNroSerie(nroSerie);
        objBateria.setCapMaxima(capMaxima);
        
        
        mostrarResultados(objBateria);
        
      int opcion;
      float Fopcion;
      boolean Bopcion;
      float TcapMaxima;
      float Tdisponibilidad;
      
    
     
      //Test Cambair estado 1
      TcapMaxima  = 0;
      Tdisponibilidad = 0;
      objBateria.cambiarEstado();
      if (TcapMaxima > Tdisponibilidad){
          System.out.println("Bateria Baja...");
      }else if(TcapMaxima== 0 && Tdisponibilidad == 0 ){
          
          System.out.println("Bateria Descargada...");
      }
      
      //Test Alerta carga 
      opcion = objBateria.alertarcarga();
        if(opcion==0){
            System.out.println("sobre el minimo ...");
        } else if(opcion==1) {
            System.out.println("Esta en el minimo, debe cargar Bateria ");
        } else { // -1
            System.out.println("No chequo el minimo, reintente ..."); 
        }   
        
        
        //Test Disponibilidad
        Fopcion = objBateria.obtenerDisponibilidad();
        if(opcion==0){
            System.out.println("Bateria con carga completa ...");
        } else if(opcion==1) {
            if(objBateria.cambiarEstado()) {
                mostrarResultados(objBateria);
            } else { // false Exception
               System.out.println("No lleno, reintente ..."); 
            }
        } else { // -1
            System.out.println("No lleno, reintente ..."); 
        }    
    }
    public static void mostrarResultados(Bateria objBateria){
        System.out.println("Numero Serie     : " + objBateria.getNroSerie());
        System.out.println("Capacidad Maxima : " + objBateria.getCapMaxima());
        System.out.println("Disponibilidad   : " + objBateria.obtenerDisponibilidad());
                       
    }
}

