package norsys.filrouge.dao.competition.impl;

import org.junit.Before;

import norsys.filrouge.dao.CompetitionDao;
import norsys.filrouge.util.ConnectionManagerH2;

public abstract class CompetitionDaoTest {
	protected CompetitionDao competitionDao;

	@Before
	public void setUp() throws Exception {
		competitionDao.setConnection(ConnectionManagerH2.getConnectionH2());
		ConnectionManagerH2.chargerH2();
	}
}
