package br.com.pix.jdbc.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.pix.jdbc.dao.ContatoDao;
import br.com.pix.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) throws SQLException {
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Adriano");
		contato.setEmail("adriano@pix.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.adiciona(contato);

		System.out.println("Gravado DAO!");
	}
}
