package norsys.filrouge.service;

import java.util.ArrayList;

import norsys.filrouge.dao.PronosticDao;
import norsys.filrouge.dao.PronosticsDaoImp;
import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class PronosticService {

	private final PronosticDao pronosticDao;

	public PronosticService() {
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
		return this.pronosticDao.createPronostic(pronostic);
	}

	public void editePronostic(Pronostic pronostic) {
		 this.pronosticDao.editPronostic(pronostic.getIdPronostic(), pronostic);
	}
}
