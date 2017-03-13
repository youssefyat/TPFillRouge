package norsys.filrouge.dao.polle.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

import norsys.filrouge.entities.Competition;
import norsys.filrouge.entities.Poulle;

public class GetPolleById extends APolleTest {
	@Test
	public void shouldGetPolleById() {
		Optional<Poulle>  polle = this.polleDao.getPoulleById(1);
		assertThat(polle.get().getLibellePoulle()).isEqualTo("A");
		
	}
	
	@Test
	public void shouldGetPolleByIdOne() {
		Optional<Poulle>  polle = this.polleDao.getPoulleById(1);
		assertThat(polle.get().getIdPoulle()).isEqualTo(1);
		
	}
}
