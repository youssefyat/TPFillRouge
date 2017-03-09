package norsys.filrouge.service;

import norsys.filrouge.dao.PronosticDao;
import norsys.filrouge.dao.PronosticsDaoImp;
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

}
