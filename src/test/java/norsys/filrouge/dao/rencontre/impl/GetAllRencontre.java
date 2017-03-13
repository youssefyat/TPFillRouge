package norsys.filrouge.dao.rencontre.impl;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import norsys.filrouge.entities.Rencontre;

public class GetAllRencontre extends ARencontreTest {

protected ArrayList<Rencontre> lstRencontres;
	
	@Before
	public void beforeTesting(){
		 lstRencontres = this.rencontreDao.getAllRencontres();
	}

	@Test
	public void shouldGetAllRencontres() {
		
		assertThat(lstRencontres.size()).isEqualTo(15);
	}
	
	
	@Test
	public void shouldNotReturnZero(){
		
		assertThat(lstRencontres.size()).isGreaterThan(0);
	}
	
	

}
