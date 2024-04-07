
package servlets.programa;

import entities.Controller;
import entities.Programa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarProg", urlPatterns = {"/SvEditarProg"})
public class SvEditarProg extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));        
        Programa prog = cont.buscarPrograma(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("progEditar", prog);
        
        String msj = "Se ha Encontrado el Programa " +id;
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("programa/editar.jsp?msj="+msj);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String gen = request.getParameter("gen");
        int cons = Integer.parseInt(request.getParameter("cons"));
        
        Programa prog = (Programa) request.getSession().getAttribute("progEditar");
        prog.setNombre(nombre);
        prog.setGenero(gen);
        prog.setConsorcio(cons);
        
        cont.editarPrograma(prog);
        
        String msj = "Programa Editado correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("programa/index.jsp?msj="+msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
