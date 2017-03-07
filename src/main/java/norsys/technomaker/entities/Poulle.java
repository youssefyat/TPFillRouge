package norsys.technomaker.entities;

public class Poulle {
	private int idPoulle;
	private String libellePoulle;

	public Poulle(int idPoulle, String libellePoulle) {
		super();
		this.idPoulle = idPoulle;
		this.libellePoulle = libellePoulle;
	}

	public int getIdPoulle() {
		return this.idPoulle;
	}

	public void setIdPoulle(int idPoulle) {
		this.idPoulle = idPoulle;
	}

	public String getLibellePoulle() {
		return this.libellePoulle;
	}

	public void setLibellePoulle(String libellePoulle) {
		this.libellePoulle = libellePoulle;
	}

}
