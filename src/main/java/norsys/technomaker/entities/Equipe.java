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

}
