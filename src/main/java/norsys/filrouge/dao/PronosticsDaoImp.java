package norsys.filrouge.dao;

import java.sql.Connection;
import java.util.ArrayList;

import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;

public class PronosticsDaoImp implements PronosticDao {

	Connection connection;

	public PronosticsDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createPronostic(Pronostic pronostic) {

		return 0;
	}

	@Override
	public ArrayList<Pronostic> getAllPronostics() {

		return null;
	}

	@Override
	public Pronostic getPronosticsById(int id) {

		return null;
	}

	@Override
	public int editPronostic(int id, Pronostic pronostic) {

		return 0;
	}

	@Override
	public ArrayList<Pronostic> getPronosticsByPersonne(Personne personne) {

		return null;
	}

}
