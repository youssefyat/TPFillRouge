package norsys.filrouge.dao.competition.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;

import norsys.filrouge.entities.Competition;

public class GetAllCompetitionTest extends CompetitionDaoTest {

	@Test
	public void shouldGetAllCompetitions() {
		ArrayList<Competition> lstCompet = this.competitionDao.getAllCompetitions();
		assertThat(lstCompet.size()).isEqualTo(1);
	}

}
