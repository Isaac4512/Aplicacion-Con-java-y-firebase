package Libreria;

public interface IBateria {
    
    final float PROC_MINIMO = 0.1F;
    final int KM_MAXIMO = 220;
    
    
    float obtenerDisponibilidad();
    float obtenerAutonomia();
    float obtenerMinimo();
    int alertarcarga();
    boolean cambiarEstado();
    
}
