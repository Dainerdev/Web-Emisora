
package servlets.consorcio;

import entities.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminarCons", urlPatterns = {"/SvEliminarCons"})
public class SvEliminarCons extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        cont.eliminarConsorcio(id);
        
        String msj = "Consorcio " + id + " Eliminado Correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("consorcio/index.jsp?msj="+msj);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
