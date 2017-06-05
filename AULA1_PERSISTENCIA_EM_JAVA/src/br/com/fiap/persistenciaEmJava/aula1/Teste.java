package br.com.fiap.persistenciaEmJava.aula1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Teste {
	private static Connection con;
	private static Statement stm;
	private static PreparedStatement ps;

	private static String url = "jdbc:mysql://localhost:3306/vendas";

	public static void main(String[] args) {
		try {
			con = DriverManager.getConnection(url, "root", "fiap");

			// String nome = "Jose";
			// String email = "ze@email.com";

			stm = con.createStatement();
			// String sql = "INSERT INTO CLIENTES (NOME,EMAIL) VALUES (?,?)";
			// ps = con.prepareStatement(sql);

			// ps.setString(1, nome);
			// ps.setString(2, email);

			// ps.execute();
			ResultSet rs = stm.executeQuery("SELECT * FROM CLIENTES");

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("email"));
			}
			
			rs.close();

			// stm.execute("INSERT INTO CLIENTES (NOME, EMAIL) VALUES('" + nome
			// + "', '" + email + "')");

			stm.close();
			//ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
