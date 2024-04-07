/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets.consorcio;

import entities.Controller;
import entities.Consorcio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvConsorcios", urlPatterns = {"/SvConsorcios"})
public class SvConsorcios extends HttpServlet {
    
    Controller cont = new Controller(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Listar Consorico
        List<Consorcio> listaConsorcios = new ArrayList<>();
        listaConsorcios = cont.listarConsorcio();
        
        // Seatamos la lista en la sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaConsorcios", listaConsorcios);

        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("consorcio/mostrarConsorcios.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Guardar Consorcio
        int emisora = Integer.parseInt(request.getParameter("emisoraId"));
        int productora = Integer.parseInt(request.getParameter("productoraId"));
        
        
        Consorcio cons = new Consorcio();
        cons.setEmisora(emisora);
        cons.setProductora(productora);
        
        cont.crearConsorcio(cons);
        
        String msj = "Consorcio Guardado correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("consorcio/index.jsp?msj="+msj);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
