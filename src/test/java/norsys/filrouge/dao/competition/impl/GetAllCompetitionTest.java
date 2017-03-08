package norsys.filrouge.dao.competition.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import norsys.filrouge.entities.Competition;

public class GetAllCompetitionTest extends CompetitionDaoTest {

	@Test
	public void shouldGetAllCompetitions() {
		ArrayList<Competition> lstCompet = competitionDao.getAllCompetitions();
		assertNotNull(lstCompet);
	}

}
