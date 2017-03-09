package norsys.filrouge.dao.equipe.impl;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import norsys.filrouge.entities.Equipe;


public class GetEquipeById extends AEquipeTest {

	@Test
	public void shouldGetEquipeById() {
		Equipe equipe = this.equipeDao.getEquipeById(1);
		assertThat(equipe.getLibelleEquipe()).isEqualTo("Equipe 1A");
		
	}
	
	@Test
	public void shouldGetEquipeByIdOne() {
		Equipe equipe = this.equipeDao.getEquipeById(1);
		assertThat(equipe.getIdEquipe()).isEqualTo(1);
		
	}
}
