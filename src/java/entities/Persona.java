
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String cedula;    
    private String nombre;
    private String rol;
    private String produccion;
    private int productora;
    private int programa;
    private int progResumen;

    public Persona() {
    }

    public Persona(int id, String cedula, String nombre, String rol, String produccion, int productora, int programa, int progResumen) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.rol = rol;
        this.produccion = produccion;
        this.productora = productora;
        this.programa = programa;
        this.progResumen = progResumen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    public int getProductora() {
        return productora;
    }

    public void setProductora(int productora) {
        this.productora = productora;
    }

    public int getPrograma() {
        return programa;
    }

    public void setPrograma(int programa) {
        this.programa = programa;
    }

    public int getProgResumen() {
        return progResumen;
    }

    public void setProgResumen(int progResumen) {
        this.progResumen = progResumen;
    }
    
    
}
