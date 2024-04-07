/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets.programa;

import entities.Controller;
import entities.Programa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvProgramas", urlPatterns = {"/SvProgramas"})
public class SvProgramas extends HttpServlet {
    
    Controller cont = new Controller(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Programa> listaProgramas = new ArrayList<>();
        listaProgramas = cont.listarPrograma();
        
        // Seatamos la lista en la sesion
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProgramas", listaProgramas);

        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("programa/mostrarProgramas.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String gen = request.getParameter("gen");
        int cons = Integer.parseInt(request.getParameter("cons"));
        
        Programa prog = new Programa();
        prog.setNombre(nombre);
        prog.setGenero(gen);
        prog.setConsorcio(cons);
        
        cont.crearPrograma(prog);
        
        
        String msj = "Programa Guardado correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("programa/index.jsp?msj="+msj);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
