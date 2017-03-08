package norsys.technomaker;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.junit.Before;
import org.junit.Test;

import norsys.technomaker.dao.PersonneDaoImp;
import norsys.technomaker.entities.Personne;
import norsys.technomaker.util.ConnectionManager;

public class TestPersonne {

	private FlatXmlDataSet	loadedDataSet;
	private PersonneDaoImp	personneDao;
	private Connection		jdbcConnection;

	protected IDatabaseConnection getConnection() throws Exception {

		jdbcConnection = ConnectionManager.getConnection();
		return new DatabaseConnection(jdbcConnection);
	}

	@Before
	public void initialiserSao() throws Exception {

		personneDao = new PersonneDaoImp();

	}

	@SuppressWarnings("deprecation")
	protected IDataSet getDataSet() throws Exception {
		loadedDataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("full_data.xml"));
		return loadedDataSet;
	}

	@Test
	public void shouldTestPersoneWithIdOne() throws SQLException {
		personneDao = new PersonneDaoImp();
		Personne personne = personneDao.getPersonneById(1);
		assertThat(personne.getIdPersonne()).isEqualTo(1);

	}

	@Test
	public void shouldGetSizePersonne() throws DataSetException, Exception {
		int personneList = this.getDataSet().getTable("personne").getRowCount();
		assertThat(personneList).isEqualTo(3);

	}

	@Test
	public void shouldTestPersonne() {
		PersonneDaoImp personnedao = new PersonneDaoImp();
		List<Personne> personneList = personnedao.getAllPersonnes();
		assertEquals(3, personneList.size());
		assertEquals("Ouijdane", personneList.get(3));

	}

}