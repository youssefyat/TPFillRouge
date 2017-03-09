package norsys.filrouge.dao.polle.impl;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import norsys.filrouge.entities.Poulle;

public class GetAllPoulles extends APolleTest{
protected ArrayList<Poulle> lstPolles;
	
	@Before
	public void beforeTesting(){
		lstPolles = this.polleDao.getAllPoulles();
	}

	@Test
	public void shouldGetAllPolles() {
		
		assertThat(lstPolles.size()).isEqualTo(2);
	}
	
	
	@Test
	public void shouldNotReturnZero(){
		
		assertThat(lstPolles.size()).isGreaterThan(0);
	}
	
	


}
