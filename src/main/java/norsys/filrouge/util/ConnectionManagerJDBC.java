package norsys.filrouge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerJDBC {
	private final String url = "jdbc:mysql://localhost:3306/tpfilrouge";
	private final String driverName = "com.mysql.jdbc.Driver";
	private final String username = "root";
	private final String password = "zaza";
	private Connection connection;
	private static ConnectionManagerJDBC connectionManagerJDBC = new ConnectionManagerJDBC();

	private ConnectionManagerJDBC() {
		try {
			Class.forName(this.driverName);
			try {

				this.connection = DriverManager.getConnection(this.url, this.username, this.password);
			} catch (SQLException ex) {
				System.out.println("echec de creation connexion avec base de données.");
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver non trouvé.");
		}
	}

	public static ConnectionManagerJDBC getInstance() {
		return connectionManagerJDBC;
	}

	public Connection getConnection() {
		return this.connection;
	}
}