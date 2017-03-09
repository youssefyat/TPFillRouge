package norsys.filrouge.dao.competition.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;

import norsys.filrouge.dao.CompetitionDao;
import norsys.filrouge.dao.CompetitionDaoImp;

public abstract class CompetitionDaoTest {
	private static Connection connection;

	protected CompetitionDao competitionDao;

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
		this.competitionDao = new CompetitionDaoImp(connection);
	}
}
