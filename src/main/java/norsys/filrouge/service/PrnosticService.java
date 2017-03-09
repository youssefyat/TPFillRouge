package norsys.filrouge.service;

import java.util.ArrayList;

import norsys.filrouge.dao.PronosticDao;
import norsys.filrouge.dao.PronosticsDaoImp;
import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class PrnosticService {

	private final PronosticDao pronosticDao;

	public PrnosticService() {
		this.pronosticDao = new PronosticsDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Pronostic getPronostic(int id) {
		return this.pronosticDao.getPronosticsById(id);
	}

	public ArrayList<Pronostic> getAllPronostics() {
		return this.pronosticDao.getAllPronostics();
	}

	public ArrayList<Pronostic> getPronosticsByPersonne(Personne personne) {
		return this.pronosticDao.getPronosticsByPersonne(personne);
	}

	public ArrayList<Pronostic> getPronostics() {
		return this.pronosticDao.getAllPronostics();
	}

	public int createPronostic(Pronostic pronostic) {
		return this.createPronostic(pronostic);
	}
}
