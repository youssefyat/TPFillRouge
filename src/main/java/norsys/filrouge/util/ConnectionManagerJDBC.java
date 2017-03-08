package norsys.filrouge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerJDBC {
	private static String		url			= "jdbc:mysql://localhost:3306/tpfilrouge";
	private static String		driverName	= "com.mysql.jdbc.Driver";
	private static String		username	= "root";
	private static String		password	= "zaza";
	private static Connection	connection;

	public static Connection getConnectionJDBC() {
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