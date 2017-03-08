package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import norsys.filrouge.entities.Personne;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class PersonneDaoImp implements PersonneDao {
	Connection cn = ConnectionManagerJDBC.getConnectionJDBC();

	@Override
	public int createPersonne(Personne personne) {

		return 0;
	}

	@Override
	public ArrayList<Personne> getAllPersonnes() {
		ArrayList<Personne> lstPersonnes = new ArrayList<Personne>();
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from personne");
			/*
			 * rechercher les pronostics associé a un personne to do lATER
			 */
			while (rs.next()) {
				int id = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String role = rs.getString(6);
				Personne pers = new Personne(id, nom, prenom, email, password, role);
				lstPersonnes.add(pers);
			}
			return lstPersonnes;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Personne getPersonneById(int id) {
		Personne pers = new Personne();
		try {
			String requetePrep = "select * from personne where idPersonne = ?";
			PreparedStatement prepStmt = cn.prepareStatement(requetePrep);
			prepStmt.setInt(1, id);
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				int idPers = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String role = rs.getString(6);
				pers = new Personne(idPers, nom, prenom, email, password, role);
			}
			return pers;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
