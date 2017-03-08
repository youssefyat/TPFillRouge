package norsys.filrouge.dao.competition.impl;

import norsys.filrouge.dao.CompetitionDao;
import norsys.filrouge.entities.Competition;
import norsys.filrouge.util.ConnectionManagerH2;

public class Test {
	public static void main(String[] args) throws Exception {
		CompetitionDao competitionDao = null;
		// competitionDao.setConnection(ConnectionManagerH2.getConnectionH2());
		ConnectionManagerH2.chargerH2();

		Competition comp = competitionDao.getCometitionById(1);
		// assertEquals(comp.getLibelleCompetition(), "CAN 2017");
		System.out.println("comp" + comp.getLibelleCompetition());

	}
}
