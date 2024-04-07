
package servlets.productora;

import entities.Controller;
import entities.Productora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarProd", urlPatterns = {"/SvEditarProd"})
public class SvEditarProd extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));        
        Productora prod = cont.buscarProductora(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("prodEditar", prod);
        
        String msj = "Se ha Encontrado la Productora " +id;
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("productora/editar.jsp?msj="+msj);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String rfc = request.getParameter("rfc");
        String tel = request.getParameter("tel");
        
        Productora prod = (Productora) request.getSession().getAttribute("prodEditar");
        prod.setNombre(nombre);
        prod.setRfc(rfc);
        prod.setTelefono(tel);
        
        cont.editarProductora(prod);
        
        String msj = "Productora Editada correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("productora/index.jsp?msj="+msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
