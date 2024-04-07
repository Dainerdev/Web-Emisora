
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProgResumen implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private int programa;
    private int consorcio;

    public ProgResumen() {
    }

    public ProgResumen(int id, String nombre, int programa, int consorcio) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
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

    public int getPrograma() {
        return programa;
    }

    public void setPrograma(int programa) {
        this.programa = programa;
    }

    public int getConsorcio() {
        return consorcio;
    }

    public void setConsorcio(int consorcio) {
        this.consorcio = consorcio;
    }
    
    
}
