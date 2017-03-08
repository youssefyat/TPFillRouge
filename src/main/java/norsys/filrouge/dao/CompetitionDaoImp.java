package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import norsys.filrouge.entities.Competition;
import norsys.filrouge.util.ConnectionManager;

public class CompetitionDaoImp implements CompetitionDao {
	Connection cn = ConnectionManager.getConnection();

	@Override
	public int createCompetition(Competition competition) {

		return 0;
	}

	@Override
	public ArrayList<Competition> getAllCompetitions() {
		ArrayList<Competition> lstCompetition = new ArrayList<Competition>();
		try {
			Statement st = cn.createStatement();
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
	public Competition getCometitionById(int id) {
		Competition comp = new Competition();
		try {
			String requetePrep = "select * from competition where idCompetition = ?";
			PreparedStatement prepStmt = cn.prepareStatement(requetePrep);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				int idComp = rs.getInt(1);
				String libelleComp = rs.getString(2);
				comp = new Competition(idComp, libelleComp);
			}
			return comp;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}