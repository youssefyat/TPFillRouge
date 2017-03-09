<<<<<<< HEAD
package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;
import norsys.filrouge.entities.Rencontre;

public class PronosticsDaoImp implements PronosticDao {

	Connection connection;

	public PronosticsDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int createPronostic(Pronostic pronostic) {

		return 0;
	}

	@Override
	public ArrayList<Pronostic> getAllPronostics() {
		ArrayList<Pronostic> lstPronostics = new ArrayList<Pronostic>();
		Rencontre rencontre = null;
		Optional<Personne> personne = null;
		RencontreDao rencontreDao = new RencontreDaoImp();
		PersonneDao personneDao = new PersonneDaoImp();
		try {
			Statement requetePron = this.connection.createStatement();
			ResultSet rsPron = requetePron.executeQuery("select * from pronostic");
			PreparedStatement requeteRenc = this.connection
			        .prepareStatement("select * from rencontre where idRencontre = ?");
			PreparedStatement requetePers = this.connection
			        .prepareStatement("select * from personne where idPersonne = ?");
			while (rsPron.next()) {
				int idPronostic = rsPron.getInt(1);
				int idRenc = rsPron.getInt(2);
				int idPers = rsPron.getInt(3);
				int butEquipe1 = rsPron.getInt(4);
				int butEquipe2 = rsPron.getInt(5);
				int score = rsPron.getInt(6);
				requeteRenc.setInt(1, idRenc);
				ResultSet rsRenc = requeteRenc.executeQuery();
				while (rsRenc.next()) {
					rencontre = rencontreDao.getRencontreById(idRenc);
				}
				requetePers.setInt(1, idRenc);
				ResultSet rsPers = requetePers.executeQuery();
				while (rsPers.next()) {
					personne = personneDao.getPersonneById(idPers);
				}
				Pronostic pronostic = new Pronostic(idPronostic, butEquipe1, butEquipe2, score, rencontre,personne.get());
				lstPronostics.add(pronostic);
			}
			return lstPronostics;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Pronostic getPronosticsById(int id) {
		Pronostic pronostic = null;
		Rencontre rencontre = null;
		Optional<Personne> personne = null;
		RencontreDao rencontreDao = new RencontreDaoImp();
		PersonneDao personneDao = new PersonneDaoImp();
		try {
			PreparedStatement requetePron = this.connection
			        .prepareStatement("select * from pronostic where idPronostic = ?");
			requetePron.setInt(1, id);
			ResultSet rsPron = requetePron.executeQuery();
			PreparedStatement requeteRenc = this.connection
			        .prepareStatement("select * from rencontre where idRencontre = ?");
			PreparedStatement requetePers = this.connection
			        .prepareStatement("select * from personne where idPersonne = ?");
			while (rsPron.next()) {
				int idPronostic = rsPron.getInt(1);
				int idRenc = rsPron.getInt(2);
				int idPers = rsPron.getInt(3);
				int butEquipe1 = rsPron.getInt(4);
				int butEquipe2 = rsPron.getInt(5);
				int score = rsPron.getInt(6);
				requeteRenc.setInt(1, idRenc);
				ResultSet rsRenc = requeteRenc.executeQuery();
				while (rsRenc.next()) {
					rencontre = rencontreDao.getRencontreById(idRenc);
				}
				requetePers.setInt(1, idRenc);
				ResultSet rsPers = requetePers.executeQuery();
				while (rsPers.next()) {
					personne = personneDao.getPersonneById(idPers);
				}
				pronostic = new Pronostic(idPronostic, butEquipe1, butEquipe2, score, rencontre, personne.get());
			}
			return pronostic;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void editPronostic(int id, Pronostic pronostic) {
		try {
			PreparedStatement reqPre = this.connection.prepareStatement(
			        "update pronostic set butEquipe1=? , butEquipe2=?, score=?, idRencontre=? , idPersonne=? where idPronostic=?");
			reqPre.setInt(1, pronostic.getButEquipe1());
			reqPre.setInt(2, pronostic.getButEquipe2());
			reqPre.setInt(3, pronostic.getScore());
			reqPre.setInt(5, pronostic.getRencontre().getIdRencontre());
			reqPre.setInt(6, pronostic.getPersonne().getIdPersonne());
			reqPre.setInt(7, id);
			reqPre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Pronostic> getPronosticsByPersonne(Personne personne) {

		return null;
	}

}
=======
package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;
import norsys.filrouge.entities.Rencontre;

public class PronosticsDaoImp implements PronosticDao {

	Connection connection;

	public PronosticsDaoImp() {
	}

	public PronosticsDaoImp(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void createPronostic(Pronostic pronostic) {
		try {
			PreparedStatement reqPre = this.connection.prepareStatement("insert into pronostic values(?,?,?,?,?,?)");
			reqPre.setInt(1, pronostic.getIdPronostic());
			reqPre.setInt(2, pronostic.getRencontre().getIdRencontre());
			reqPre.setInt(3, pronostic.getPersonne().getIdPersonne());
			reqPre.setInt(4, pronostic.getButEquipe1());
			reqPre.setInt(5, pronostic.getButEquipe2());
			reqPre.setInt(6, pronostic.getScore());
			reqPre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Pronostic> getAllPronostics() {
		ArrayList<Pronostic> lstPronostics = new ArrayList<Pronostic>();
		Rencontre rencontre = null;
		Personne personne = null;
		RencontreDao rencontreDao = new RencontreDaoImp();
		PersonneDao personneDao = new PersonneDaoImp();
		try {
			Statement requetePron = this.connection.createStatement();
			ResultSet rsPron = requetePron.executeQuery("select * from pronostic");
			PreparedStatement requeteRenc = this.connection
					.prepareStatement("select * from rencontre where idRencontre = ?");
			PreparedStatement requetePers = this.connection
					.prepareStatement("select * from personne where idPersonne = ?");
			while (rsPron.next()) {
				int idPronostic = rsPron.getInt(1);
				int idRenc = rsPron.getInt(2);
				int idPers = rsPron.getInt(3);
				int butEquipe1 = rsPron.getInt(4);
				int butEquipe2 = rsPron.getInt(5);
				int score = rsPron.getInt(6);
				requeteRenc.setInt(1, idRenc);
				ResultSet rsRenc = requeteRenc.executeQuery();
				while (rsRenc.next()) {
					rencontre = rencontreDao.getRencontreById(idRenc);
				}
				requetePers.setInt(1, idRenc);
				ResultSet rsPers = requetePers.executeQuery();
				while (rsPers.next()) {
					personne = personneDao.getPersonneById(idPers);
				}
				Pronostic pronostic = new Pronostic(idPronostic, butEquipe1, butEquipe2, score, rencontre, personne);
				lstPronostics.add(pronostic);
			}
			return lstPronostics;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Pronostic getPronosticsById(int id) {
		Pronostic pronostic = null;
		Rencontre rencontre = null;
		Personne personne = null;
		RencontreDao rencontreDao = new RencontreDaoImp();
		PersonneDao personneDao = new PersonneDaoImp();
		try {
			PreparedStatement requetePron = this.connection
					.prepareStatement("select * from pronostic where idPronostic = ?");
			requetePron.setInt(1, id);
			ResultSet rsPron = requetePron.executeQuery();
			PreparedStatement requeteRenc = this.connection
					.prepareStatement("select * from rencontre where idRencontre = ?");
			PreparedStatement requetePers = this.connection
					.prepareStatement("select * from personne where idPersonne = ?");
			while (rsPron.next()) {
				int idPronostic = rsPron.getInt(1);
				int idRenc = rsPron.getInt(2);
				int idPers = rsPron.getInt(3);
				int butEquipe1 = rsPron.getInt(4);
				int butEquipe2 = rsPron.getInt(5);
				int score = rsPron.getInt(6);
				requeteRenc.setInt(1, idRenc);
				ResultSet rsRenc = requeteRenc.executeQuery();
				while (rsRenc.next()) {
					rencontre = rencontreDao.getRencontreById(idRenc);
				}
				requetePers.setInt(1, idPers);
				ResultSet rsPers = requetePers.executeQuery();
				while (rsPers.next()) {
					personne = personneDao.getPersonneById(idPers);
				}
				pronostic = new Pronostic(idPronostic, butEquipe1, butEquipe2, score, rencontre, personne);
			}
			return pronostic;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void editPronostic(int id, Pronostic pronostic) {
		try {
			PreparedStatement reqPre = this.connection
					.prepareStatement("update pronostic set  score=? where idPronostic=?");
			reqPre.setInt(1, pronostic.getScore());
			reqPre.setInt(2, id);
			reqPre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Pronostic> getPronosticsByPersonne(Personne personne) {
		ArrayList<Pronostic> lstPronostic = new ArrayList<Pronostic>();
		Pronostic pronostic = null;
		Rencontre rencontre = null;
		RencontreDao rencontreDao = new RencontreDaoImp(this.connection);
		try {
			PreparedStatement requetePron = this.connection
					.prepareStatement("select * from pronostic where idPersonne = ? ");
			requetePron.setInt(1, personne.getIdPersonne());
			ResultSet rsPron = requetePron.executeQuery();

			while (rsPron.next()) {
				int idPronostic = rsPron.getInt(1);
				int idRenc = rsPron.getInt(2);
				int butEquipe1 = rsPron.getInt(4);
				int butEquipe2 = rsPron.getInt(5);
				int score = rsPron.getInt(6);

				rencontre = rencontreDao.getRencontreById(idRenc);

				pronostic = new Pronostic(idPronostic, butEquipe1, butEquipe2, score, rencontre, personne);
				lstPronostic.add(pronostic);
			}
			return lstPronostic;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
>>>>>>> branch 'master' of https://github.com/youssefyat/TPFillRouge.git
