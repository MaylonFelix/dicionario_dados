package br.com.pix.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import br.com.pix.model.Country;
import br.com.pix.model.Entidade;
import br.com.pix.persistence.EntidadeDAO;

/**
 * Servlet implementation class CadastraEntidade
 */
@WebServlet("/CadastraEntidadeAjax")
public class CadastraEntidadeAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		doPost(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		// PRECISA SER DEFINIDO ASSIM ANTES DE ANDAR RSPOSTA PARA O NAVEGADOR
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();

		// PRECISA SER DFINIDO ASSIM ANTES LER O QUE VEIO DO NAVEGADOR
		String enc = request.getCharacterEncoding();
		if (enc == null)
			request.setCharacterEncoding("UTF-8");

		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");

		Gson gson = new Gson();
		JsonObject myObj = new JsonObject();//objeto json

		EntidadeDAO entidadeDAO = new EntidadeDAO();
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
		entidade.setDescricao(descricao);
		entidadeDAO.adiciona(entidade);
			
		JsonElement entidadeObj = gson.toJsonTree(entidade);
		myObj.addProperty("success", true);
		myObj.addProperty("msg", entidade.getNome()+" cadastrada com sucesso!");
		myObj.add("entidade", entidadeObj);
		
		out.println(myObj);
		out.flush();
		out.close();
	}

}
