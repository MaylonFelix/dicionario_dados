package br.com.pix.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		/**----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 * Até a versão 3 do JDBC, antes de chamar o DriverManager.getConnection() era necessário registrar o driver JDBC que iria ser utilizado através do método Class.forName("com.mysql.jdbc.Driver"), no caso do MySQL, que carregava essa classe, e essa se comunicava com o DriverManager. 
		 * A partir do JDBC 4, que está presente no Java 6, esse passo não é mais necessário. Mas lembre-se: caso você utilize JDBC em um projeto com Java 5 ou anterior, será preciso fazer o registro do Driver JDBC, carregando a sua classe, que vai se registrar no DriverManager.
		 * Isso também pode ser necessário em alguns servidores de aplicação e web, como no Tomcat 7 ou posterior, por proteção para possíveis vazamentos de memória
		 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 * try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		/*Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","admin");
		System.out.println("Conectado!");
		conexao.close();*/
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
		
		
	}
}
