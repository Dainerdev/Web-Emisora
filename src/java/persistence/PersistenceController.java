
package persistence;

import entities.Emisora;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.exceptions.NonexistentEntityException;

public class PersistenceController {

    ConsorcioJpaController consJpa = new ConsorcioJpaController();
    EmisoraJpaController emiJpa = new EmisoraJpaController();
    ProductoraJpaController produJpa = new ProductoraJpaController();

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

    // Find para Edit
    public Emisora buscarEmisora(int id) {
        return emiJpa.findEmisora(id);
    }
    // Edit
    public void editarEmisora(Emisora emi) {
        try {
            emiJpa.edit(emi);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
