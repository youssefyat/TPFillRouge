package norsys.filrouge.dao.competition.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import norsys.filrouge.entities.Competition;

public class GetCompetitionByIdTest extends CompetitionDaoTest {

	@Test
	public void shouldGetCompetitionById() {
		Optional<Competition> comp = this.competitionDao.getCometitionById(1);
		assertThat(comp.get().getLibelleCompetition()).isEqualTo("CAN 2017");
		
	}
	
	@Test
	public void shouldGetCompetitionByIdOne() {
		Optional<Competition> comp = this.competitionDao.getCometitionById(1);
		assertThat(comp.get().getIdCompetition()).isEqualTo(1);
		
	}
}


