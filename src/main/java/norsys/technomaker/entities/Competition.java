package norsys.technomaker.entities;

public class Competition {
	private int		idCompetition;
	private String	libelleCompetition;

	public Competition(int idCompetition, String libelleCompetition) {
		super();
		this.idCompetition = idCompetition;
		this.libelleCompetition = libelleCompetition;
	}

	public String getLibelleCompetition() {
		return this.libelleCompetition;
	}

	public void setLibelleCompetition(String libelleCompetition) {
		this.libelleCompetition = libelleCompetition;
	}

	public int getIdCompetition() {
		return this.idCompetition;
	}

}
