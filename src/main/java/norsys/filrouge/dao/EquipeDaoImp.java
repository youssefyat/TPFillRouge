package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

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
		ArrayList<Equipe> lstEquipe = new ArrayList<Equipe>();
		try {
			Statement st = this.connection.createStatement();
			ResultSet rs = st.executeQuery("select * from equipe");
			while (rs.next()) {
				int idEquipe = rs.getInt(1);
				String libelle = rs.getString(2);
				String img = rs.getString(3);
				Equipe equipe = new Equipe(idEquipe, libelle, img);
				lstEquipe.add(equipe);
			}
			return lstEquipe;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Optional<Equipe> getEquipeById(int id) {
		Equipe equipe = new Equipe();
		try {
			String requetePrep = "select * from equipe where idEquipe = ?";
			PreparedStatement prepStmt = this.connection.prepareStatement(requetePrep);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				int idEquipe = rs.getInt(1);
				String libelle = rs.getString(2);
				String img = rs.getString(3);
				equipe = new Equipe(idEquipe, libelle, img);
			}
			return Optional.ofNullable(equipe);

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
