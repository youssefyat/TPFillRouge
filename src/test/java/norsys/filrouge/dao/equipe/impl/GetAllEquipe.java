package norsys.filrouge.dao.equipe.impl;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import norsys.filrouge.entities.Equipe;


public class GetAllEquipe extends AEquipeTest {
protected ArrayList<Equipe> lstEquipes;
	
	@Before
	public void beforeTesting(){
		lstEquipes = this.equipeDao.getAllEquipes();
	}

	@Test
	public void shouldGetAllEquipe() {
		
		assertThat(lstEquipes.size()).isEqualTo(8);
	}
	
	
	@Test
	public void shouldNotReturnZero(){
		
		assertThat(lstEquipes.size()).isGreaterThan(0);
	}
	
	


}
