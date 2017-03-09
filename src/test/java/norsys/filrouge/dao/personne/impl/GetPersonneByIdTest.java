package norsys.filrouge.dao.personne.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import norsys.filrouge.entities.Personne;

public class GetPersonneByIdTest extends ApersonneTest {

	@Test
	public void shouldGetPersonneById() {
		boolean testExist = this.personneDao.getAllPersonnes().stream()
				.filter(p -> p.getIdPersonne()==1).findFirst().isPresent();
		;

		assertTrue(testExist);

	}

	@Test
	public void shouldGetPersonneExist() {
		
		boolean testExist = this.personneDao.getAllPersonnes().stream()
				.filter(p -> p.getNomPersonne().equals("HAMMADI")).findFirst().isPresent();
		;

		assertTrue(testExist);

	}
	@Test
	public void shouldGetPersonneByIdOne() {
		Optional<Personne> personne = this.personneDao.getPersonneById(1);
		assertThat(personne.get().getIdPersonne()).isEqualTo(1);

	}
}
