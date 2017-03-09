package norsys.filrouge.dao.equipe.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import norsys.filrouge.entities.Equipe;


public class GetEquipeById extends AEquipeTest {

	@Test
	public void shouldGetEquipeById() {
		Optional<Equipe> equipe = this.equipeDao.getEquipeById(1);
		assertThat(equipe.get().getLibelleEquipe()).isEqualTo("Equipe 1A");
		
	}
	
	@Test
	public void shouldGetEquipeByIdOne() {
		Optional<Equipe> equipe = this.equipeDao.getEquipeById(1);
		assertThat(equipe.get().getIdEquipe()).isEqualTo(1);
		
	}
}
