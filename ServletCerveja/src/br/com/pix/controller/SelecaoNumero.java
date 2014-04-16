package br.com.pix.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pix.model.NumeroExpert;

/**
 * Servlet implementation class SelecaoNumero
 */
@WebServlet("/SelecaoNumero")
public class SelecaoNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		
		NumeroExpert ce = new NumeroExpert();
		List<String> numeros = ce.getNumeros(tipo);
		
		String mensagem = "teste";
	
		
		request.setAttribute("numeros", numeros);
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher rd;
		if(tipo.equals("par")){
			rd = request.getRequestDispatcher("resultadoPar.jsp");
		}
		else{
			rd = request.getRequestDispatcher("resultadoImpar.jsp");
		}
		
		rd.forward(request, response);
	
	}

}
