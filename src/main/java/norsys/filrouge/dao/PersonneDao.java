package norsys.filrouge.dao;

import java.util.ArrayList;

import norsys.filrouge.entities.Personne;

public interface PersonneDao {

	public int createPersonne(Personne personne);

	public ArrayList<Personne> getAllPersonnes();

	public Personne getPersonneById(int id);

	public void editPersonne(int id, Personne personne);

}
