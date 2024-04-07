
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Emisora implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombre;    
    private String frecuencia;
    private String transmision;

    public Emisora() {
    }

    public Emisora(int id, String nombre, String frecuencia, String transmision) {
        this.id = id;
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.transmision = transmision;
    }


    public int getId() {
        return id;
    }   

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    
}
