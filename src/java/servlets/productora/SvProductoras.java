/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets.productora;

import entities.Controller;
import entities.Productora;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvProductoras", urlPatterns = {"/SvProductoras"})
public class SvProductoras extends HttpServlet {
    
    Controller cont = new Controller(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Productora> listaProductoras = new ArrayList<>();
        listaProductoras = cont.listarProductora();
        
        // Seatamos la lista en la sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProductoras", listaProductoras);

        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("productora/mostrarProductoras.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String rfc = request.getParameter("rfc");
        String tel = request.getParameter("tel");
        
        Productora prod = new Productora();
        prod.setNombre(nombre);
        prod.setRfc(rfc);
        prod.setTelefono(tel);
        
        cont.crearProductora(prod);
        
        
        String msj = "Productora Guardada correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("productora/index.jsp?msj="+msj);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
