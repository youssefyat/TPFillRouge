package norsys.technomaker.entities;

import java.sql.Time;

public class Rencontre {
	private final int idRencontre;
	private Time dateDebut;
	private Time dateFin;
	private int butEquipe1;
	private int butRquipe2;
	Equipe equipe1;
	Equipe equipe2;
	Poulle poulle;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.butEquipe1;
		result = prime * result + this.butRquipe2;
		result = prime * result + (this.dateDebut == null ? 0 : this.dateDebut.hashCode());
		result = prime * result + (this.dateFin == null ? 0 : this.dateFin.hashCode());
		result = prime * result + (this.equipe1 == null ? 0 : this.equipe1.hashCode());
		result = prime * result + (this.equipe2 == null ? 0 : this.equipe2.hashCode());
		result = prime * result + this.idRencontre;
		result = prime * result + (this.poulle == null ? 0 : this.poulle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Rencontre other = (Rencontre) obj;
		if (this.butEquipe1 != other.butEquipe1) {
			return false;
		}
		if (this.butRquipe2 != other.butRquipe2) {
			return false;
		}
		if (this.dateDebut == null) {
			if (other.dateDebut != null) {
				return false;
			}
		} else if (!this.dateDebut.equals(other.dateDebut)) {
			return false;
		}
		if (this.dateFin == null) {
			if (other.dateFin != null) {
				return false;
			}
		} else if (!this.dateFin.equals(other.dateFin)) {
			return false;
		}
		if (this.equipe1 == null) {
			if (other.equipe1 != null) {
				return false;
			}
		} else if (!this.equipe1.equals(other.equipe1)) {
			return false;
		}
		if (this.equipe2 == null) {
			if (other.equipe2 != null) {
				return false;
			}
		} else if (!this.equipe2.equals(other.equipe2)) {
			return false;
		}
		if (this.idRencontre != other.idRencontre) {
			return false;
		}
		if (this.poulle == null) {
			if (other.poulle != null) {
				return false;
			}
		} else if (!this.poulle.equals(other.poulle)) {
			return false;
		}
		return true;
	}

}
