
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consorcio implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private int emisora;
    private int productora;

    public Consorcio() {
    }

    public Consorcio(int id, int emisora, int productora) {
        this.id = id;
        this.emisora = emisora;
        this.productora = productora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmisora() {
        return emisora;
    }

    public void setEmisora(int emisora) {
        this.emisora = emisora;
    }

    public int getProductora() {
        return productora;
    }

    public void setProductora(int productora) {
        this.productora = productora;
    }

    
    
}
