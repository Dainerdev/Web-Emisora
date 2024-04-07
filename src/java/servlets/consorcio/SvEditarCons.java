
package servlets.consorcio;

import entities.Consorcio;
import entities.Controller;
import entities.Emisora;
import entities.Productora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarCons", urlPatterns = {"/SvEditarCons"})
public class SvEditarCons extends HttpServlet {
    
    Controller cont = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));        
        Consorcio cons = cont.buscarConsorcio(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("consEditar", cons);
        
        String msj = "Se ha Encontrado el Consorcio " +id;
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("consorcio/editar.jsp?msj="+msj);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int emi = Integer.parseInt(request.getParameter("emi"));
        int prod = Integer.parseInt(request.getParameter("prod"));
        
        Consorcio cons = (Consorcio) request.getSession().getAttribute("consEditar");
        cons.setEmisora(emi);
        cons.setProductora(prod);
        
        cont.editarEmisora(cons);
        
        String msj = "Consorcio Editado correctamente";
        
        // Redireccionamiento a otra pagina JSP
        response.sendRedirect("consorcio/index.jsp?msj="+msj);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
