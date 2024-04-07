
package servlets.emisora;

import entities.Controller;
import entities.Emisora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));        
        Emisora emi = cont.buscarEmisora(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("emiEditar", emi);
        
        String msj = "Se ha Encontrado la Emisora " +id;
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("emisora/editar.jsp?msj="+msj);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String frec = request.getParameter("frec");
        String trans = request.getParameter("trans");
        
        Emisora emi = (Emisora) request.getSession().getAttribute("emiEditar");
        emi.setNombre(nombre);
        emi.setFrecuencia(frec);
        emi.setTransmision(trans);
        
        cont.editarEmisora(emi);
        
        String msj = "Emisora Editada correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("emisora/index.jsp?msj="+msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
