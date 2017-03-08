package norsys.technomaker.entities;

public class Equipe {
	private int idEquipe;
	private String libelleEquipe;
	private String imgEquipe;

	public Equipe(int idEquipe, String libelleEquipe, String imgEquipe) {
		super();
		this.idEquipe = idEquipe;
		this.libelleEquipe = libelleEquipe;
		this.imgEquipe = imgEquipe;
	}

	public int getIdEquipe() {
		return this.idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}

	public String getLibelleEquipe() {
		return this.libelleEquipe;
	}

	public void setLibelleEquipe(String libelleEquipe) {
		this.libelleEquipe = libelleEquipe;
	}

	public String getImgEquipe() {
		return this.imgEquipe;
	}

	public void setImgEquipe(String imgEquipe) {
		this.imgEquipe = imgEquipe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.idEquipe;
		result = prime * result + (this.imgEquipe == null ? 0 : this.imgEquipe.hashCode());
		result = prime * result + (this.libelleEquipe == null ? 0 : this.libelleEquipe.hashCode());
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
		Equipe other = (Equipe) obj;
		if (this.idEquipe != other.idEquipe) {
			return false;
		}
		if (this.imgEquipe == null) {
			if (other.imgEquipe != null) {
				return false;
			}
		} else if (!this.imgEquipe.equals(other.imgEquipe)) {
			return false;
		}
		if (this.libelleEquipe == null) {
			if (other.libelleEquipe != null) {
				return false;
			}
		} else if (!this.libelleEquipe.equals(other.libelleEquipe)) {
			return false;
		}
		return true;
	}

}
