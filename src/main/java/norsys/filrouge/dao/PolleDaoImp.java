package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

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
		ArrayList<Poulle> lstPoulles = new ArrayList<Poulle>();
		try {
			Statement st = this.connection.createStatement();
			ResultSet rs = st.executeQuery("select * from poulle");
			/*
			 * rechercher les pronostics associé a un personne to do lATER
			 */
			while (rs.next()) {
				int idPoulle = rs.getInt(1);
				String libelle = rs.getString(2);
				Poulle poulle = new Poulle(idPoulle, libelle);
				lstPoulles.add(poulle);
			}
			return lstPoulles;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Optional<Poulle>  getPoulleById(int id) {
		 Poulle poulle = new Poulle();
		try {
			Statement st = this.connection.createStatement();
			ResultSet rs = st.executeQuery("select * from poulle");
			/*
			 * rechercher les pronostics associé a un personne to do lATER
			 */
			while (rs.next()) {
				int idPoulle = rs.getInt(1);
				String libelle = rs.getString(2);
				poulle = new Poulle(idPoulle, libelle);
			}
			return Optional.of(poulle);

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
