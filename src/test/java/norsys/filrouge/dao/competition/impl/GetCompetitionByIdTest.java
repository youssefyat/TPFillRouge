package norsys.filrouge.dao.competition.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import norsys.filrouge.entities.Competition;

public class GetCompetitionByIdTest extends CompetitionDaoTest {

	@Test
	public void shouldGetCompetitionById() {
		Competition comp = this.competitionDao.getCometitionById(1);
		assertEquals(comp.getLibelleCompetition(), "CAN 2017");
	}
}
