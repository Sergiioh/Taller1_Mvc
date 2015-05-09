/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import model.ModeloLista;

@WebServlet("/ControlLista")
public class ControlLista extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ControlLista() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String name = null;
        String name2 = null;
        name = request.getParameter("lista");
        name2 = request.getParameter("lista1");
        ModeloLista mlbean1 = new ModeloLista();

        if (name != null) {
            mlbean1.setLista(name);
            mlbean1.setId(Integer.parseInt((String) sesion.getAttribute("userId")));
            mlbean1.CrearLista();
            name = null;
        }
        if (name2 != null) {
            mlbean1.setLista(name2);
            mlbean1.setId(Integer.parseInt((String) sesion.getAttribute("userId")));
            mlbean1.Eliminarlista();
            name2 = null;
        }

        request.setAttribute("beanlista", mlbean1);

        Boolean status = mlbean1.isBorrado();
        Boolean status2 = mlbean1.isIngreso();

        if (status == true || status2 == true) {
            status = false;
            status2 = false;
            RequestDispatcher rd = request.getRequestDispatcher("/view/login-ok.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/view/login-fail.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }
}
