package norsys.filrouge.dao.competition.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import norsys.filrouge.entities.Competition;

public class GetAllCompetitionTest extends CompetitionDaoTest {
	
	protected ArrayList<Competition> lstCompet;
	
	@Before
	public void beforeTesting(){
		 lstCompet = this.competitionDao.getAllCompetitions();
	}

	@Test
	public void shouldGetAllCompetitions() {
		
		assertThat(lstCompet.size()).isEqualTo(1);
	}
	
	
	@Test
	public void shouldNotReturnZero(){
		
		assertThat(lstCompet.size()).isGreaterThan(0);
	}
	
	

}
