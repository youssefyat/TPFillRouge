package norsys.filrouge.dao.polle.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.BeforeClass;
import norsys.filrouge.dao.PolleDao;
import norsys.filrouge.dao.PolleDaoImp;


public abstract class APolleTest {
	private static Connection connection;

	protected PolleDao polleDao;

	private static final String PATH = "db/";
	private static final String URL = "jdbc:h2:mem:testTpFileRouge;INIT=runscript from '" + PATH
			+ "/createBase.sql'\\;runscript from '" + PATH + "/insertData.sql'";

	@BeforeClass
	public static void init()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection(URL, "root", "");
	}

	@Before
	public void setUp() throws Exception {
		this.polleDao = new PolleDaoImp(connection);
	}
}