package br.com.pix.jdbc.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactorySAC {
	public Connection getConnection() {
		try {
			//return DriverManager.getConnection("jdbc:mysql://localhost/dicionario_dados","root", "admin");
			return DriverManager.getConnection("jdbc:mysql://172.16.253.47:3306/sacqware","qware", "qware");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
