package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

import norsys.filrouge.entities.Competition;
import norsys.filrouge.entities.Rencontre;

public class RencontreDaoImp implements RencontreDao {

	Connection connection;

	public RencontreDaoImp() {
	}

	public RencontreDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createRencontre(Rencontre rencontre) {

		return 0;
	}

	@Override
	public ArrayList<Rencontre> getAllRencontres() {
		ArrayList<Rencontre> lstRencontre = new ArrayList<Rencontre>();
		try {
			Statement st = this.connection.createStatement();
			ResultSet rs = st.executeQuery("select * from rencontre");

			while (rs.next()) {
				int idRen = rs.getInt(1);
				lstRencontre.add(this.getRencontreById(idRen));
			}
			return lstRencontre;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Rencontre getRencontreById(int id) {
		Rencontre rencontre = null;
		Competition competition;

		CompetitionDao competitionDao = new CompetitionDaoImp(this.connection);
		PolleDao polleDao = new PolleDaoImp(this.connection);
		EquipeDao equipeDao = new EquipeDaoImp(this.connection);
		try {
			PreparedStatement prepStmt = this.connection
					.prepareStatement("select * from rencontre where idRencontre = ?");
			prepStmt.setInt(1, id);

			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				int idRen = rs.getInt(1);
				int idPoulle = rs.getInt(2);
				int idEq1 = rs.getInt(3);
				int idEq2 = rs.getInt(4);
				int idCmp = rs.getInt(5);
				Time dateDebut = rs.getTime(6);
				Time dateFin = rs.getTime(7);
				int butEq1 = rs.getInt(8);
				int butEq2 = rs.getInt(9);
				rencontre = new Rencontre(idRen, dateDebut, dateFin, butEq1, butEq2, equipeDao.getEquipeById(idEq1),
						equipeDao.getEquipeById(idEq2), polleDao.getPoulleById(idPoulle));
			}
			return rencontre;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}