package norsys.technomaker.entities;

import java.sql.Time;

public class Rencontre {
	private int		idRencontre;
	private Time	dateDebut;
	private Time	dateFin;
	private int		butEquipe1;
	private int		butRquipe2;
	Equipe			equipe1;
	Equipe			equipe2;
	Poulle			poulle;

	public Rencontre(int idRencontre, Time dateDebut, Time dateFin, int butEquipe1, int butRquipe2, Equipe equipe1,
	        Equipe equipe2, Poulle poulle) {
		super();
		this.idRencontre = idRencontre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.butEquipe1 = butEquipe1;
		this.butRquipe2 = butRquipe2;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.poulle = poulle;
	}

	public Time getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Time dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Time getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Time dateFin) {
		this.dateFin = dateFin;
	}

	public int getButEquipe1() {
		return this.butEquipe1;
	}

	public void setButEquipe1(int butEquipe1) {
		this.butEquipe1 = butEquipe1;
	}

	public int getButRquipe2() {
		return this.butRquipe2;
	}

	public void setButRquipe2(int butRquipe2) {
		this.butRquipe2 = butRquipe2;
	}

	public Equipe getEquipe1() {
		return this.equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return this.equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

	public Poulle getPoulle() {
		return this.poulle;
	}

	public void setPoulle(Poulle poulle) {
		this.poulle = poulle;
	}

	public int getIdRencontre() {
		return this.idRencontre;
	}

}
