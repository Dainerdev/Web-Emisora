
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Consorcio implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    private Emisora emisora;
    @OneToOne
    private Productora productora;

    public Consorcio() {
    }

    public Consorcio(int id, Emisora emisora, Productora productora) {
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

    public Emisora getEmisora() {
        return emisora;
    }

    public void setEmisora(Emisora emisora) {
        this.emisora = emisora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }
    
    
}
