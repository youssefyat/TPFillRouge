package norsys.technomaker.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static String		url			= "jdbc:mysql://localhost:3306/tpfilrouge";
	private static String		driverName	= "com.mysql.jdbc.Driver";
	private static String		username	= "root";
	private static String		password	= "admin";
	private static Connection	connection;

	public static Connection getConnection() {
		try {
			Class.forName(driverName);
			try {

				connection = DriverManager.getConnection(url, username, password);
			} catch (SQLException ex) {
				System.out.println("echec de creation connexion avec base de données.");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver non trouvé.");
		}
		return connection;
	}
}
