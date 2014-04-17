package br.com.pix.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pix.model.Entidade;
import br.com.pix.persistence.EntidadeDAO;

public class RemoveEntidadeLogica implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 int id = Integer.parseInt(request.getParameter("id"));

		    Entidade entidade = new Entidade();
		    entidade.setId(id);

		    EntidadeDAO dao = new EntidadeDAO();
		    dao.exclui(entidade);

		    System.out.println("Excluindo contato... ");

		    return "lista_entidades.jsp";
	}
	
	

}
