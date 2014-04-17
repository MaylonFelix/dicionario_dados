package br.com.pix.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pix.model.Entidade;
import br.com.pix.persistence.EntidadeDAO;

public class CadastraEntidadeLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");

		EntidadeDAO entidadeDAO = new EntidadeDAO();
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
		entidade.setDescricao(descricao);
		entidadeDAO.adiciona(entidade);

		request.setAttribute("entidade", entidade);

		return "resultado_cadastra_entidade.jsp";
	}
}