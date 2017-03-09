package norsys.filrouge.dao;

import java.util.ArrayList;

import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;

public interface PronosticDao {

	public int createPronostic(Pronostic pronostic);

	public ArrayList<Pronostic> getAllPronostics();

	public Pronostic getPronosticsById(int id);

	public void editPronostic(int id, Pronostic pronostic);

	public ArrayList<Pronostic> getPronosticsByPersonne(Personne personne);

}
