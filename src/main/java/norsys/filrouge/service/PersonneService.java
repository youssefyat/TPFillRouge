package norsys.filrouge.service;

import java.util.ArrayList;

import norsys.filrouge.dao.PersonneDao;
import norsys.filrouge.dao.PersonneDaoImp;
import norsys.filrouge.entities.Personne;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class PersonneService {

	private final PersonneDao personneDao;

	public PersonneService() {
		this.personneDao = new PersonneDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Personne getPersonne(int id) {
		return this.personneDao.getPersonneById(id);
	}

	public ArrayList<Personne> getAllPersonne() {
		return this.personneDao.getAllPersonnes();
	}

	public void editePersonne(Personne personne) {
		this.personneDao.editPersonne(personne.getIdPersonne(), personne);
	}

}
