package norsys.technomaker.entities;

public class Competition {
	private int idCompetition;
	private String libelleCompetition;

	public Competition(int idCompetition, String libelleCompetition) {
		super();
		this.idCompetition = idCompetition;
		this.libelleCompetition = libelleCompetition;
	}

	public Competition() {
		super();
	}

	public int getIdCompetition() {
		return this.idCompetition;
	}

	public void setIdCompetition(int idCompetition) {
		this.idCompetition = idCompetition;
	}

	public String getLibelleCompetition() {
		return this.libelleCompetition;
	}

	public void setLibelleCompetition(String libelleCompetition) {
		this.libelleCompetition = libelleCompetition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.idCompetition;
		result = prime * result + (this.libelleCompetition == null ? 0 : this.libelleCompetition.hashCode());
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
		Competition other = (Competition) obj;
		if (this.idCompetition != other.idCompetition) {
			return false;
		}
		if (this.libelleCompetition == null) {
			if (other.libelleCompetition != null) {
				return false;
			}
		} else if (!this.libelleCompetition.equals(other.libelleCompetition)) {
			return false;
		}
		return true;
	}

}
