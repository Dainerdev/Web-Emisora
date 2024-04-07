
package servlets.programa;

import entities.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminarProg", urlPatterns = {"/SvEliminarProg"})
public class SvEliminarProg extends HttpServlet {
    
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
        cont.eliminarPrograma(id);
        
        String msj = "Programa " + id + " Eliminado Correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("programa/index.jsp?msj="+msj);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
