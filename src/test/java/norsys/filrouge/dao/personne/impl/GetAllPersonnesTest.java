package norsys.filrouge.dao.personne.impl;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import norsys.filrouge.entities.Personne;

public class GetAllPersonnesTest extends ApersonneTest {

 protected ArrayList<Personne> lstPersonnes;
	
	@Before
	public void beforeTesting(){
		lstPersonnes = this.personneDao.getAllPersonnes();
	}

	@Test
	public void shouldGetAllPersonnes() {
		
		assertThat(lstPersonnes.size()).isEqualTo(3);
	}
	
	
	@Test
	public void shouldNotReturnZero(){
		
		assertThat(lstPersonnes.size()).isGreaterThan(0);
	}
	
	


}
