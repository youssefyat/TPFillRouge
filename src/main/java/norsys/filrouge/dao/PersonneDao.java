package norsys.filrouge.dao;

import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.entities.Personne;

public interface PersonneDao {

	public int createPersonne(Personne personne);

	public ArrayList<Personne> getAllPersonnes();

	public Optional<Personne> getPersonneById(int id);

	public void editPersonne(int id, Personne personne);

}
