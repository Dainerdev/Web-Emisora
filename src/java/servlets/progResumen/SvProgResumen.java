/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets.progResumen;

import entities.Controller;
import entities.ProgResumen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvProgResumen", urlPatterns = {"/SvProgResumen"})
public class SvProgResumen extends HttpServlet {
    
    Controller cont = new Controller(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<ProgResumen> listaProgResumen = new ArrayList<>();
        listaProgResumen = cont.listarProgResumen();
        
        // Seatamos la lista en la sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProgResumen", listaProgResumen);

        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("progResumen/mostrarProgResumen.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        int prog = Integer.parseInt(request.getParameter("prog"));
        int cons = Integer.parseInt(request.getParameter("cons"));
        
        ProgResumen progResum = new ProgResumen();
        progResum.setNombre(nombre);
        progResum.setPrograma(prog);
        progResum.setConsorcio(cons);
        
        cont.crearProgResumen(progResum);
        
        
        String msj = "Programa Resumen Guardado correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("progResumen/index.jsp?msj="+msj);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
