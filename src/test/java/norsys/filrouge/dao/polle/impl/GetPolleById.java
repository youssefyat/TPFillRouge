package norsys.filrouge.dao.polle.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import norsys.filrouge.entities.Competition;
import norsys.filrouge.entities.Poulle;

public class GetPolleById extends APolleTest {
	@Test
	public void shouldGetPolleById() {
		Poulle polle = this.polleDao.getPoulleById(1);
		assertThat(polle.getLibellePoulle()).isEqualTo("A");
		
	}
	
	@Test
	public void shouldGetPolleByIdOne() {
		Poulle polle = this.polleDao.getPoulleById(1);
		assertThat(polle.getIdPoulle()).isEqualTo(1);
		
	}
}
