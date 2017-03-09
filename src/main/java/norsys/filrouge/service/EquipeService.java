package norsys.filrouge.service;

import java.util.ArrayList;

import norsys.filrouge.dao.EquipeDao;
import norsys.filrouge.dao.EquipeDaoImp;
import norsys.filrouge.entities.Equipe;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class EquipeService {

	private final EquipeDao equipeDao;

	public EquipeService() {
		this.equipeDao = new EquipeDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Equipe getEquipe(int id) {
		return this.equipeDao.getEquipeById(id);
	}

	public ArrayList<Equipe> getAllEquipes() {
		return this.equipeDao.getAllEquipes();
	}
}
