package norsys.filrouge.util;

import java.io.File;
import java.nio.charset.Charset;

import javax.sql.DataSource;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.RunScript;
import org.junit.Before;
import org.junit.BeforeClass;

public class XmlDataSetTest {

	private static final String	JDBC_DRIVER	= org.h2.Driver.class.getName();
	private static final String	JDBC_URL	= "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
	private static final String	USER		= "sa";
	private static final String	PASSWORD	= "";

	@BeforeClass
	public static void createSchema() throws Exception {
		RunScript.execute("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "", "db/createBase.sql", Charset.defaultCharset(),
		        false);
	}

	@Before
	public void importDataSet() throws Exception {
		IDataSet dataSet = readDataSet();
		cleanlyInsert(dataSet);
	}

	private IDataSet readDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new File("full_data.xml"));
	}

	private void cleanlyInsert(IDataSet dataSet) throws Exception {
		IDatabaseTester databaseTester = new JdbcDatabaseTester(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
		databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
		databaseTester.setDataSet(dataSet);
		databaseTester.onSetup();
	}

	private DataSource dataSource() {
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL(JDBC_URL);
		dataSource.setUser(USER);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}
}
