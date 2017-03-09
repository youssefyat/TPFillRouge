package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.entities.Competition;

public class CompetitionDaoImp implements CompetitionDao {
	Connection connection;

	public CompetitionDaoImp(Connection connection) {
		try {
			this.connection = connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int createCompetition(Competition competition) {

		return 0;
	}

	@Override
	public ArrayList<Competition> getAllCompetitions() {
		ArrayList<Competition> lstCompetition = new ArrayList<Competition>();
		try {
			Statement st = this.connection.createStatement();
			ResultSet rs = st.executeQuery("select * from competition");
			while (rs.next()) {
				int id = rs.getInt(1);
				String libelle = rs.getString(2);
				Competition comp = new Competition(id, libelle);
				lstCompetition.add(comp);
			}
			return lstCompetition;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Optional<Competition> getCometitionById(int id) {
		Competition comp = new Competition();
		try {
			String requetePrep = "select * from competition where idCompetition = ?";
			PreparedStatement prepStmt = this.connection.prepareStatement(requetePrep);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				int idComp = rs.getInt(1);
				String libelleComp = rs.getString(2);
				comp = new Competition(idComp, libelleComp);
			}
			return Optional.ofNullable(comp);

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
