package norsys.filrouge.dao;

import java.sql.Connection;
import java.util.ArrayList;

import norsys.filrouge.entities.Poulle;

public class PolleDaoImp implements PolleDao {
	Connection connection;

	public PolleDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createPoulle(Poulle poulle) {

		return 0;
	}

	@Override
	public ArrayList<Poulle> getAllPoulles() {

		return null;
	}

	@Override
	public Poulle getPoulleById(int id) {

		return null;
	}

}
