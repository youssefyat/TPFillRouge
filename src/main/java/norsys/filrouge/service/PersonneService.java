package norsys.filrouge.service;

import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.dao.PersonneDao;
import norsys.filrouge.dao.PersonneDaoImp;
import norsys.filrouge.entities.Personne;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class PersonneService {

	private final PersonneDao personneDao;

	public PersonneService() {
		this.personneDao = new PersonneDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Optional<Personne> getPersonne(int id) {
		return this.personneDao.getPersonneById(id);
	}

	public ArrayList<Personne> getAllPersonne() {
		return this.personneDao.getAllPersonnes();
	}

	public int editePersonne(Personne personne) {
		// return this.personneDao.editePersonne();
		return 0;
	}

}
