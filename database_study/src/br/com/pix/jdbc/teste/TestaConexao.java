package br.com.pix.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		/**----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 * At� a vers�o 3 do JDBC, antes de chamar o DriverManager.getConnection() era necess�rio registrar o driver JDBC que iria ser utilizado atrav�s do m�todo Class.forName("com.mysql.jdbc.Driver"), no caso do MySQL, que carregava essa classe, e essa se comunicava com o DriverManager. 
		 * A partir do JDBC 4, que est� presente no Java 6, esse passo n�o � mais necess�rio. Mas lembre-se: caso voc� utilize JDBC em um projeto com Java 5 ou anterior, ser� preciso fazer o registro do Driver JDBC, carregando a sua classe, que vai se registrar no DriverManager.
		 * Isso tamb�m pode ser necess�rio em alguns servidores de aplica��o e web, como no Tomcat 7 ou posterior, por prote��o para poss�veis vazamentos de mem�ria
		 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 * try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		/*Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","admin");
		System.out.println("Conectado!");
		conexao.close();*/
		Connection connection = new ConnectionFactorySAC().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
		
		
	}
}
