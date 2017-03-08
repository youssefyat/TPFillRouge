package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Personne;
import norsys.technomaker.entities.Pronostic;

public interface PronosticDao {

	public int createPronostic(Pronostic pronostic);

	public ArrayList<Pronostic> getAllPronostics();

	public Pronostic getPronosticsById(int id);

	public int editPronostic(int id, Pronostic pronostic);

	public ArrayList<Pronostic> getPronosticsByPersonne(Personne personne);

}
