package norsys.technomaker.dao;

public class Equipe {
	private int		idEquipe;
	private String	libelleEquipe;
	private byte[]	imgEquipe;

	public Equipe(String libelleEquipe, byte[] imgEquipe) {
		super();
		this.libelleEquipe = libelleEquipe;
		this.imgEquipe = imgEquipe;
	}

}
