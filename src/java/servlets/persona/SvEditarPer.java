
package servlets.persona;

import entities.Controller;
import entities.Persona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarPer", urlPatterns = {"/SvEditarPer"})
public class SvEditarPer extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));        
        Persona per = cont.buscarPersona(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("perEditar", per);
        
        String msj = "Se ha Encontrado la Persona " +id;
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("persona/editar.jsp?msj="+msj);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String cedula = request.getParameter("cedu");
        String nombre = request.getParameter("nombre");
        String rol = request.getParameter("rol");
        String produc = request.getParameter("produc");
        int product = Integer.parseInt(request.getParameter("product"));
        int prog = Integer.parseInt(request.getParameter("prog"));
        int progRes = Integer.parseInt(request.getParameter("progResum"));
        
        Persona pers = (Persona) request.getSession().getAttribute("perEditar");
        pers.setCedula(cedula);
        pers.setNombre(nombre);
        pers.setRol(rol);
        pers.setProduccion(produc);
        pers.setProductora(product);
        pers.setPrograma(prog);
        pers.setProgResumen(progRes);
        
        cont.editarPersona(pers);
        
        String msj = "Persona Editada correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("persona/index.jsp?msj="+msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
