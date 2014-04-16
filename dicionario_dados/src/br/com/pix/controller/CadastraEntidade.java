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
@WebServlet("/CadastraEntidade")
public class CadastraEntidade extends HttpServlet {
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
        if ( enc == null )
        	request.setCharacterEncoding( "UTF-8" ); 
		
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		
		/*response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		response.setHeader("Cache-control", "no-cache, no-store");
		request.setCharacterEncoding("UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.setHeader("Access-Control-Max-Age", "86400");
		/*response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8"); 
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "-1");*/
		
		
	
		
		Gson gson = new Gson();
		JsonObject myObj = new JsonObject();//objeto json

		EntidadeDAO entidadeDAO = new EntidadeDAO();
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
		entidade.setDescricao(descricao);
		entidadeDAO.adiciona(entidade);
			
		JsonElement entidadeObj = gson.toJsonTree(entidade);
		myObj.addProperty("success", true);
		myObj.add("entidade", entidadeObj);
		
		out.println(myObj);
		out.flush();
		out.close();
	}

}
