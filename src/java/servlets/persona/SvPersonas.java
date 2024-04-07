/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets.persona;

import entities.Controller;
import entities.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvPersonas", urlPatterns = {"/SvPersonas"})
public class SvPersonas extends HttpServlet {
    
    Controller cont = new Controller(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas = cont.listarPersona();
        
        // Seatamos la lista en la sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaPersonas", listaPersonas);

        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("persona/mostrarPersonas.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String cedula = request.getParameter("cedu");
        String nombre = request.getParameter("nombre");
        String rol = request.getParameter("rol");
        String produc = request.getParameter("produc");
        int product = Integer.parseInt(request.getParameter("product"));
        int prog = Integer.parseInt(request.getParameter("prog"));
        int progRes = Integer.parseInt(request.getParameter("progRes"));
        
        Persona per = new Persona();
        per.setCedula(cedula);
        per.setNombre(nombre);
        per.setRol(rol);
        per.setProduccion(produc);
        per.setProductora(product);
        per.setPrograma(prog);
        per.setProgResumen(progRes);
        
        cont.crearPersona(per);
        
        
        String msj = "Persona Guardada correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("persona/index.jsp?msj="+msj);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
