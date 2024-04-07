
package servlets.progResumen;

import entities.Controller;
import entities.ProgResumen;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarPres", urlPatterns = {"/SvEditarPres"})
public class SvEditarPres extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));        
        ProgResumen progres = cont.buscarProgResumen(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("progResumEditar", progres);
        
        String msj = "Se ha Encontrado el Programa " +id;
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("progResumen/editar.jsp?msj="+msj);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        int prog = Integer.parseInt(request.getParameter("prog"));
        int cons = Integer.parseInt(request.getParameter("cons"));
        
        ProgResumen progres = (ProgResumen) request.getSession().getAttribute("progResumEditar");
        progres.setNombre(nombre);
        progres.setPrograma(prog);
        progres.setConsorcio(cons);
        
        cont.editarProgResumen(progres);
        
        String msj = "Programa Resumen Editado correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("progResumen/index.jsp?msj="+msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
