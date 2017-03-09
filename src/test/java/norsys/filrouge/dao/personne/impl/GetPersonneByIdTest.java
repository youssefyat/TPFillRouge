package norsys.filrouge.dao.personne.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

import norsys.filrouge.entities.Competition;
import norsys.filrouge.entities.Personne;

public class GetPersonneByIdTest extends ApersonneTest {

	@Test
	public void shouldGetPersonneById() {
		Personne personne = this.personneDao.getPersonneById(1);
		assertThat(personne.getNomPersonne()).isEqualTo("HAMMADI");
		
	}
	
	@Test
	public void shouldGetPersonneByIdOne() {
		Personne personne = this.personneDao.getPersonneById(1);
		assertThat(personne.getIdPersonne()).isEqualTo(1);
		
	}
}
