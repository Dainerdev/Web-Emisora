
package entities;

import java.util.List;
import persistence.PersistenceController;

public class Controller {

    PersistenceController perCon = new PersistenceController();
    
    // Controller para Emisora
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
    
    //Controller para Productora
    public void crearProductora (Productora prod){
        perCon.crearProductora(prod);
    }
    
    public List<Productora> listarProductora(){
        return perCon.listarProductora();
    }

    public void eliminarProductora(int id) {
        perCon.eliminarProductora(id);
    }

    public Productora buscarProductora(int id) {
        return perCon.buscarProductora(id);
    }

    public void editarProductora(Productora prod) {
        perCon.editarProductora(prod);
    }
    
    //Controller para Consorcio
    public void crearConsorcio(Consorcio cons) {
        perCon.crearConsorcio(cons);  
    }

    public List<Consorcio> listarConsorcio() {
        return perCon.listarConsorcio();
    }

    public void eliminarConsorcio(int id) {
        perCon.eliminarConsorcio(id);
    }

    public Consorcio buscarConsorcio(int id) {
        return perCon.buscarConsorcio(id);
    }

    public void editarEmisora(Consorcio cons) {
        perCon.editarEmisora(cons);
    }

    //Controller para Programa
    public void crearPrograma(Programa prog) {
        perCon.crearPrograma(prog);
    }

    public List<Programa> listarPrograma() {
        return perCon.listarPrograma();
    }

    public void eliminarPrograma(int id) {
        perCon.eliminarPrograma(id);
    }

    public Programa buscarPrograma(int id) {
        return perCon.buscarPrograma(id);
    }

    public void editarPrograma(Programa prog) {
        perCon.editarPrograma(prog);
    }
    
    
    //Controller para Programa Resumen 
    public void crearProgResumen(ProgResumen progResum) {
        perCon.crearProgResumen(progResum);
    }

    public List<ProgResumen> listarProgResumen() {
        return perCon.listarProgResumen();
    }
    
    
    
    
    
    
    
    
}

