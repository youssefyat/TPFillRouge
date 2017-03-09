package norsys.filrouge.service;

import norsys.filrouge.dao.PronosticDao;
import norsys.filrouge.dao.PronosticsDaoImp;

public class PrnosticService {

	private final PronosticDao pronosticDao;

	public PrnosticService() {
		this.pronosticDao = new PronosticsDaoImp();
		// this.pronosticDao();
	}

}
