
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/cadastro")
public class ClienteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cliente resultado = new Cliente ();
			
			int ID =       req.getIntHeader("ID");
			String CPF =   req.getParameter("CPF");
			String RG =    req.getParameter("RG");
			String Nome =  req.getParameter("Nome");
			String Email = req.getParameter("Email");
			String Sexo =  req.getParameter("Sexo");
			
			
			resultado.setID(ID);
			resultado.setCPF(CPF);
			resultado.setRG(RG);
			resultado.setNome(Nome);
			resultado.setEmail(Email);	
			resultado.setSexo(Sexo);
			
			req.setAttribute("res", resultado);
			req.setAttribute("ID", resultado.getID());
			req.setAttribute("Nome", resultado.getNome());
			req.setAttribute("CPF", resultado.getCPF());
			req.setAttribute("RG", resultado.getRG());
			req.setAttribute("Email", resultado.getEmail());
			req.setAttribute("Sexo", resultado.getSexo());
			
					
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("Resultado.jsp");
			dispatcher.forward(req, resp);
	

			
			
	}
	}
