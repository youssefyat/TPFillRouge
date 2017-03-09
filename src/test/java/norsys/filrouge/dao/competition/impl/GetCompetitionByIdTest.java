package norsys.filrouge.dao.competition.impl;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import norsys.filrouge.entities.Competition;

public class GetCompetitionByIdTest extends CompetitionDaoTest {

	@Test
	public void shouldGetCompetitionById() {
		Competition comp = this.competitionDao.getCometitionById(1);
		assertThat(comp.getLibelleCompetition()).isEqualTo("CAN 2017");
		
	}
	
	@Test
	public void shouldGetCompetitionByIdOne() {
		Competition comp = this.competitionDao.getCometitionById(1);
		assertThat(comp.getIdCompetition()).isEqualTo(1);
		
	}
}


