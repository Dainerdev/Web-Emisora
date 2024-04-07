
package entities;

import java.util.List;
import persistence.PersistenceController;

public class Controller {

    PersistenceController perCon = new PersistenceController();
    
    public void crearEmisora (Emisora emi){
        perCon.crearEmisora(emi);
    }
    
    public List<Emisora> listarEmisora(){
        return perCon.listarEmisora();
    }

    public void eliminarEmisora(int id) {
        perCon.eliminarEmisora(id);
    }

    public Emisora buscarEmisora(int id) {
        return perCon.buscarEmisora(id);
    }

    public void editarEmisora(Emisora emi) {
        perCon.editarEmisora(emi);
    }
    
    
    
    
}

