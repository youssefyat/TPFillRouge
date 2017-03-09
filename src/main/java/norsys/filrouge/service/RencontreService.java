package norsys.filrouge.service;

import java.util.ArrayList;

import norsys.filrouge.dao.RencontreDao;
import norsys.filrouge.dao.RencontreDaoImp;
import norsys.filrouge.entities.Rencontre;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class RencontreService {

	private final RencontreDao rencontreDao;

	public RencontreService() {
		this.rencontreDao = new RencontreDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Rencontre getRencontre(int id) {
		return this.rencontreDao.getRencontreById(id);
	}

	public ArrayList<Rencontre> getAllRencontres() {
		return this.rencontreDao.getAllRencontres();
	}
}