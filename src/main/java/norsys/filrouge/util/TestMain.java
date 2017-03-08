package norsys.filrouge.util;

import static org.h2.engine.Constants.UTF8;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.sql.DataSource;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.RunScript;

import norsys.filrouge.entities.Personne;



public class TestMain {
	private static final String JDBC_DRIVER = org.h2.Driver.class.getName();
	private static final String JDBC_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
	private static final String USER = "sa";
	private static final String PASSWORD = "";
	
	public static void createSchema() throws Exception {
		RunScript.execute(JDBC_URL, USER, PASSWORD, "resources/createBase.sql", UTF8, false);
		RunScript.execute(JDBC_URL, USER, PASSWORD, "resources/insertData.sql", UTF8, false);
		
		

		
	}
	private static DataSource dataSource() {
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL(JDBC_URL);
		dataSource.setUser(USER);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}
	public static void main(String[] args) throws Exception {
		createSchema();
		DataSource d=dataSource();
		Personne pers = new Personne();
		
			String requetePrep = "select * from personne where idPersonne = ?";
			PreparedStatement prepStmt = d.getConnection().prepareStatement(requetePrep);
			prepStmt.setInt(1, 1);
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				int idPers = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String role = "";
				pers = new Personne(idPers, nom, prenom, email, password, role);
				System.out.println(pers.getIdPersonne()+"okkkkk");
			}
	}
}
