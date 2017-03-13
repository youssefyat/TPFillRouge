package norsys.filrouge.dao.rencontre.impl;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import norsys.filrouge.entities.Rencontre;

public class GetRencontreById extends ARencontreTest {

	@Test
	public void shouldGetRencontreById() {
		Rencontre rencontre = this.rencontreDao.getRencontreById(1);
		assertThat(rencontre.getEquipe1()).isEqualTo(1);
		
	}
	
	@Test
	public void shouldGetRencontreByIdOne() {
      Rencontre rencontre = this.rencontreDao.getRencontreById(1);
		assertThat(rencontre.getIdRencontre()).isEqualTo(1);
		
	}
}
