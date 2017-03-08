package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Personne;

public interface PersonneDao {

	public int createPersonne(Personne personne);

	public ArrayList<Personne> getAllPersonnes();

	public Personne getPersonneById(int id);

}
