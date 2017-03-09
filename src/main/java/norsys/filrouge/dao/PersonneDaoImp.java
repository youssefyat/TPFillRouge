package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import norsys.filrouge.entities.Personne;

public class PersonneDaoImp implements PersonneDao {
	Connection connection;

	public PersonneDaoImp() {
	}

	public PersonneDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createPersonne(Personne personne) {

		return 0;
	}

	@Override
	public ArrayList<Personne> getAllPersonnes() {
		ArrayList<Personne> lstPersonnes = new ArrayList<Personne>();
		Personne personne;
		try {
			Statement st = this.connection.createStatement();
			ResultSet rs = st.executeQuery("select * from personne");

			while (rs.next()) {
				int idPers = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String role = rs.getString(6);
				personne = new Personne(idPers, nom, prenom, email, password, role);
				lstPersonnes.add(personne);
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
			PreparedStatement prepStmt = this.connection.prepareStatement(requetePrep);
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

	@Override
	public void editPersonne(int id, Personne personne) {
		try {
			PreparedStatement reqPre = this.connection.prepareStatement(
			        "update personne set nomPersonne=?, prenomPersonne=?, email=?, passwd=?,role=? where idPersonne=?");
			reqPre.setString(1, personne.getNomPersonne());
			reqPre.setString(2, personne.getPrenomPersonne());
			reqPre.setString(3, personne.getEmail());
			reqPre.setString(4, personne.getPassword());
			reqPre.setString(5, personne.getRole());
			reqPre.setInt(6, id);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
