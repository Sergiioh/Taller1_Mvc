package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import model.ModeloLogin;

@WebServlet("/ControlUsuario")
public class ControlUsuario extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public ControlUsuario(){
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession sesion = request.getSession();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		ModeloLogin mlbean = new ModeloLogin();
		mlbean.setName(name);
		mlbean.setPassword(password);
		mlbean.ValidarLogin();
                
		
		request.setAttribute("bean", mlbean);
		
		Boolean status = mlbean.isEstado();
		
                
		if(status == true){
                        sesion.setAttribute("userId", mlbean.getId());
			RequestDispatcher rd = request.getRequestDispatcher("/view/Principal.jsp");
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
