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

import model.ModeloLogin;

@WebServlet("/ControlLista")
public class ControlLista extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public ControlLista(){
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		ModeloLogin mlbean = new ModeloLogin();
		mlbean.setName(name);
		mlbean.setPassword(password);
		mlbean.ValidarLogin();
		
		request.setAttribute("bean", mlbean);
		
		Boolean status = mlbean.isEstado();
		
		if(status){
			RequestDispatcher rd = request.getRequestDispatcher("/view/login-ok.jsp");
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd = request.getRequestDispatcher("/view/login-fail.jsp");
			rd.forward(request, response);	
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		doPost(request, response);
	}
}