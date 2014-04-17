package br.com.pix.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pix.model.Entidade;
import br.com.pix.persistence.EntidadeDAO;

public class ListaEntidadeLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			List<Entidade> entidades = new EntidadeDAO().getLista();

	      // Guarda a lista no request
	      request.setAttribute("entidades", entidades);
	  
	      return "lista_entidades.jsp";
	}

}
