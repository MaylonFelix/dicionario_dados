package br.com.pix.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pix.model.CervejaExpert;

@WebServlet("/SelecaoCerveja")
public class SelecaoCerveja extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String c = request.getParameter("cor");
		
		CervejaExpert ce = new CervejaExpert();
		List<String> marcas = ce.getMarcas(c);
		
		request.setAttribute("marcas", marcas);
		
		RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
		
		rd.forward(request, response);
	
	}

}
