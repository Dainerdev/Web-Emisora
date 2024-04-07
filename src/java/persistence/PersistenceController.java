
package persistence;

import entities.Consorcio;
import entities.Emisora;
import entities.Productora;
import entities.ProgResumen;
import entities.Programa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.exceptions.NonexistentEntityException;

public class PersistenceController {

    ConsorcioJpaController consJpa = new ConsorcioJpaController();
    EmisoraJpaController emiJpa = new EmisoraJpaController();
    ProductoraJpaController produJpa = new ProductoraJpaController();
    ProgramaJpaController progJpa = new ProgramaJpaController();
    ProgResumenJpaController resumJpa = new ProgResumenJpaController();

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

    }
    
    // PersistenceController Para Consorcio

    public void crearConsorcio(Consorcio cons) {
        consJpa.create(cons);
    }

    public List<Consorcio> listarConsorcio() {
        return consJpa.findConsorcioEntities();
    }

    public void eliminarConsorcio(int id) {
        try {
            consJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Consorcio buscarConsorcio(int id) {
        return consJpa.findConsorcio(id);
    }

    public void editarEmisora(Consorcio cons) {
        try {
            consJpa.edit(cons);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // PersistenceController Para Consorcio
    
    public void crearPrograma(Programa prog) {
        progJpa.create(prog);
    }

    public List<Programa> listarPrograma() {
        return progJpa.findProgramaEntities();
    }

    public void eliminarPrograma(int id) {
        try {
            progJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Programa buscarPrograma(int id) {
        return progJpa.findPrograma(id);
    }

    public void editarPrograma(Programa prog) {
        try {
            progJpa.edit(prog);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearProgResumen(ProgResumen progResum) {
        resumJpa.create(progResum);
    }

    public List<ProgResumen> listarProgResumen() {
        return resumJpa.findProgResumenEntities();
    }

    public void eliminarProgResumen(int id) {
        try {
            resumJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ProgResumen buscarProgResumen(int id) {
        return resumJpa.findProgResumen(id);
    }

    public void editarProgResumen(ProgResumen progRes) {
        try {
            resumJpa.edit(progRes);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
}
