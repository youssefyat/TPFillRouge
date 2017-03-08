package norsys.technomaker.entities;

public class Pronostic {
	private int idPronostic;
	private int butEquipe1;
	private int butEquipe2;
	private int score;
	Rencontre rencontre;
	Personne personne;

	public Pronostic(int idPronostic, int butEquipe1, int butEquipe2, int score, Rencontre rencontre,
			Personne personne) {
		super();
		this.idPronostic = idPronostic;
		this.butEquipe1 = butEquipe1;
		this.butEquipe2 = butEquipe2;
		this.score = score;
		this.rencontre = rencontre;
		this.personne = personne;
	}

	public int getIdPronostic() {
		return this.idPronostic;
	}

	public void setIdPronostic(int idPronostic) {
		this.idPronostic = idPronostic;
	}

	public int getButEquipe1() {
		return this.butEquipe1;
	}

	public void setButEquipe1(int butEquipe1) {
		this.butEquipe1 = butEquipe1;
	}

	public int getButEquipe2() {
		return this.butEquipe2;
	}

	public void setButEquipe2(int butEquipe2) {
		this.butEquipe2 = butEquipe2;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Rencontre getRencontre() {
		return this.rencontre;
	}

	public void setRencontre(Rencontre rencontre) {
		this.rencontre = rencontre;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.butEquipe1;
		result = prime * result + this.butEquipe2;
		result = prime * result + this.idPronostic;
		result = prime * result + (this.personne == null ? 0 : this.personne.hashCode());
		result = prime * result + (this.rencontre == null ? 0 : this.rencontre.hashCode());
		result = prime * result + this.score;
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
		Pronostic other = (Pronostic) obj;
		if (this.butEquipe1 != other.butEquipe1) {
			return false;
		}
		if (this.butEquipe2 != other.butEquipe2) {
			return false;
		}
		if (this.idPronostic != other.idPronostic) {
			return false;
		}
		if (this.personne == null) {
			if (other.personne != null) {
				return false;
			}
		} else if (!this.personne.equals(other.personne)) {
			return false;
		}
		if (this.rencontre == null) {
			if (other.rencontre != null) {
				return false;
			}
		} else if (!this.rencontre.equals(other.rencontre)) {
			return false;
		}
		if (this.score != other.score) {
			return false;
		}
		return true;
	}

}
