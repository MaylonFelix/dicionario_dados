package br.com.pix.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pix.model.Entidade;
import br.com.pix.persistence.EntidadeDAO;

/**
 * Servlet implementation class ListaEntidades
 */
@WebServlet("/ListaEntidades")
public class ListaEntidades extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntidadeDAO entidadeDAO = new EntidadeDAO();
		List<Entidade> entidades =  entidadeDAO.getLista();
		request.setAttribute("entidades", entidades);
		request.setAttribute("entidades.size", entidades.size());
		RequestDispatcher rd = request.getRequestDispatcher("lista_entidades.jsp");
		rd.forward(request, response);
	}
}
