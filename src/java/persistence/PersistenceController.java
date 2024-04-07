
package persistence;

import entities.Emisora;
import entities.Productora;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.exceptions.NonexistentEntityException;

public class PersistenceController {

    ConsorcioJpaController consJpa = new ConsorcioJpaController();
    EmisoraJpaController emiJpa = new EmisoraJpaController();
    ProductoraJpaController produJpa = new ProductoraJpaController();

    // PersistenceController Para Emisora
    // Create Emisora
    public void crearEmisora(Emisora emi) {
        emiJpa.create(emi);
    }
    
    // Read Emisora
    public List<Emisora> listarEmisora() {
        return emiJpa.findEmisoraEntities();
    }
    
    // Delete Emisora
    public void eliminarEmisora(int id) {
        try {
            emiJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Find para Edit Emisora
    public Emisora buscarEmisora(int id) {
        return emiJpa.findEmisora(id);
    }
    
    // Edit Emisora
    public void editarEmisora(Emisora emi) {
        try {
            emiJpa.edit(emi);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // PersistenceController Para Productora
    // Create Productora
    public void crearProductora(Productora prod) {
        produJpa.create(prod);
    }
    
    // Read Productora
    public List<Productora> listarProductora() {
        return produJpa.findProductoraEntities();
    }
    
    // Delete Productora
    public void eliminarProductora(int id) {
        try {
            produJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Find para Edit Productora
    public Productora buscarProductora(int id) {
        return produJpa.findProductora(id);
    }

    // Edit Productora
    public void editarProductora(Productora prod) {
        try {
            produJpa.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
;
    }
    
    
    
}
