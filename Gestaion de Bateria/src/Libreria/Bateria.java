
package Libreria;

public class Bateria implements IBateria{
// Atributos
private int nroSerie;
private float capMaxima;
private float consumo;
private String estado;

// Constructores
public Bateria() {
         
}
public Bateria(int nroSerie, float capMaxima, float consumo, String estado) {
this.nroSerie = nroSerie;
this.capMaxima = capMaxima;
this.consumo = consumo;
this.estado = estado;
}

// Propiedades
public int getNroSerie() {
return nroSerie;
}

public void setNroSerie(int nroSerie) {
this.nroSerie = nroSerie;
}

public float getCapMaxima() {
return capMaxima;
}

public void setCapMaxima(float capMaxima) {
this.capMaxima = capMaxima;
}

public float getConsumo() {
return consumo;
}

public void setConsumo(float consumo) {
this.consumo = consumo;
}
public String getEstado() {
return estado;
}

public void setEstado(String estado) {
this.estado = estado;
}

// Métodos
@Override
public float obtenerDisponibilidad() {
try {
return this.capMaxima - this.consumo;
} catch(Exception e) {
return -1.0F;
}
}

@Override
public float obtenerAutonomia() {
try {
float disponibilidad = obtenerDisponibilidad();
return disponibilidad * IBateria.KM_MAXIMO;
} catch(Exception e) {
return -1.0F;
}
}

@Override
public float obtenerMinimo() {
try {
return this.capMaxima * IBateria.PROC_MINIMO;
} catch(Exception er) {
return -1.0F;
}
}

@Override
public int alertarcarga() {
try {
if(obtenerDisponibilidad() < obtenerMinimo()){
return 1;
}
return 0;
} catch(Exception e) {
return -1;
}
}

@Override
public boolean cambiarEstado() {
try {
if(obtenerDisponibilidad()==0){
this.estado="Descargada";
} else if(obtenerDisponibilidad() < obtenerMinimo()) {
this.estado="Bateria Baja";
}
return true;
} catch(Exception e) {
return false;
}
}
}


