package norsys.filrouge.dao;

import java.sql.Connection;
import java.util.ArrayList;

import norsys.filrouge.entities.Rencontre;

public class RencontreDaoImp implements RencontreDao {

	Connection connection;

	public RencontreDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createRencontre(Rencontre rencontre) {

		return 0;
	}

	@Override
	public ArrayList<Rencontre> getAllRencontres() {

		return null;
	}

	@Override
	public Rencontre getRencontreById(int id) {

		return null;
	}

}