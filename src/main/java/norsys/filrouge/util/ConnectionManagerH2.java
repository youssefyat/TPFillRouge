package norsys.filrouge.util;

import static org.h2.engine.Constants.UTF8;

import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.RunScript;

public class ConnectionManagerH2 {
	private static final String	JDBC_URL	= "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
	private static final String	USER		= "sa";
	private static final String	PASSWORD	= "";

	public static Connection getConnectionH2() throws SQLException {
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL(JDBC_URL);
		dataSource.setUser(USER);
		dataSource.setPassword(PASSWORD);
		return dataSource.getConnection();
	}

	public static void createSchema() throws Exception {
		RunScript.execute(JDBC_URL, USER, PASSWORD, "db/createBase.sql", UTF8, false);

	}

	public static void insertSchema() throws Exception {
		RunScript.execute(JDBC_URL, USER, PASSWORD, "db/insertData.sql", UTF8, false);
	}

	public static void chargerH2() throws Exception {
		createSchema();
		insertSchema();
	}
}
