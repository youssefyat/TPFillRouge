package norsys.filrouge.service;

import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.dao.PolleDao;
import norsys.filrouge.dao.PolleDaoImp;
import norsys.filrouge.entities.Poulle;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class PoulleService {

	private final PolleDao poulleDao;

	public PoulleService() {
		this.poulleDao = new PolleDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Optional<Poulle>  getPoulle(int id) {
		return this.poulleDao.getPoulleById(id);
	}

	public ArrayList<Poulle> getAllPoulles() {
		return this.poulleDao.getAllPoulles();
	}
}