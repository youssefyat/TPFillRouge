package norsys.filrouge.dao;

import java.sql.Connection;
import java.util.ArrayList;

import norsys.filrouge.entities.Equipe;

public class EquipeDaoImp implements EquipeDao {
	Connection connection;

	public EquipeDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createEquipe(Equipe equipe) {

		return 0;
	}

	@Override
	public ArrayList<Equipe> getAllEquipes() {

		return null;
	}

	@Override
	public Equipe getEquipeById(int id) {

		return null;
	}

}
