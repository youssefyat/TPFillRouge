package norsys.filrouge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

import norsys.filrouge.entities.Competition;
import norsys.filrouge.entities.Equipe;
import norsys.filrouge.entities.Poulle;
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
		Equipe equipe1 = null;
		Equipe equipe2 = null;
		Poulle poulle = null;
		try {
			PreparedStatement prepStmt = this.connection
					.prepareStatement("select * from rencontre where idRencontre = ?");
			prepStmt.setInt(1, id);
			PreparedStatement prepCmp = this.connection
					.prepareStatement("select * from competition where idCompetition = ?");
			PreparedStatement prepPoulle = this.connection.prepareStatement("select * from poulle where idPoulle = ?");
			PreparedStatement prepEquipe = this.connection.prepareStatement("select * from equipe where idEquipe = ?");
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

				/* chargement de l'equipe 2 */
				prepEquipe.setInt(1, idEq1);
				ResultSet rsEq1 = prepEquipe.executeQuery();
				while (rsEq1.next()) {
					equipe1 = new Equipe(rsEq1.getInt(1), rsEq1.getString(2), rsEq1.getString(3));
				}
				/* chargement de l'equipe 2 */
				prepEquipe.setInt(1, idEq2);
				ResultSet rsEq2 = prepEquipe.executeQuery();
				while (rsEq2.next()) {
					equipe2 = new Equipe(rsEq2.getInt(1), rsEq2.getString(2), rsEq2.getString(3));
				}

				/* chargement du competition */
				prepCmp.setInt(1, idCmp);
				ResultSet rsCmp = prepCmp.executeQuery();
				while (rsCmp.next()) {
					competition = new Competition(rsCmp.getInt(1), rsCmp.getString(2));
				}

				/* chargement du poulle */
				prepPoulle.setInt(1, idPoulle);
				ResultSet rsPoulle = prepPoulle.executeQuery();
				while (rsPoulle.next()) {
					poulle = new Poulle(rsPoulle.getInt(1), rsPoulle.getString(2));
				}

				rencontre = new Rencontre(idRen, dateDebut, dateFin, butEq1, butEq2, equipe1, equipe2, poulle);
			}
			return rencontre;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}