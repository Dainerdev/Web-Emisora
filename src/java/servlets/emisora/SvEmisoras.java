/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets.emisora;

import entities.Controller;
import entities.Emisora;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEmisoras", urlPatterns = {"/SvEmisoras"})
public class SvEmisoras extends HttpServlet {
    
    Controller cont = new Controller(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Emisora> listaEmisoras = new ArrayList<>();
        listaEmisoras = cont.listarEmisora();
        
        // Seatamos la lista en la sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaEmisoras", listaEmisoras);

        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("emisora/mostrarEmisoras.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String frec = request.getParameter("frec");
        String trans = request.getParameter("trans");
        
        Emisora emi = new Emisora();
        emi.setNombre(nombre);
        emi.setFrecuencia(frec);
        emi.setTransmision(trans);
        
        cont.crearEmisora(emi);
        
        
        String msj = "Emisora Guardada   correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("emisora/index.jsp?msj="+msj);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
