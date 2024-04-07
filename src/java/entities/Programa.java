
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Programa implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String genero;
    private int consorcio;

    public Programa() {
    }

    public Programa(int id, String nombre, String genero, int consorcio) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.consorcio = consorcio;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getConsorcio() {
        return consorcio;
    }

    public void setConsorcio(int consorcio) {
        this.consorcio = consorcio;
    }
    
    
    
}
