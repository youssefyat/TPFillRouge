package norsys.filrouge.dao.pronostic.impl;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import norsys.filrouge.entities.Pronostic;

public class GetAllPronostic  extends APronosticTest{

protected ArrayList<Pronostic> lstPronostic;
	
	@Before
	public void beforeTesting(){
		 lstPronostic = this.pronosticDao.getAllPronostics();
	}

	@Test
	public void shouldGetAllPronostics() {
		
		assertThat(lstPronostic.size()).isEqualTo(0);
	}
	
	
	@Test
	public void shouldReturnZero(){
		
		assertThat(lstPronostic.size()).isEqualTo(0);
	}
	
	

}
