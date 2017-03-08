package norsys.technomaker.entities;

public class Poulle {
	private int idPoulle;
	private String libellePoulle;

	public Poulle() {
		super();
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.idPoulle;
		result = prime * result + (this.libellePoulle == null ? 0 : this.libellePoulle.hashCode());
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
		Poulle other = (Poulle) obj;
		if (this.idPoulle != other.idPoulle) {
			return false;
		}
		if (this.libellePoulle == null) {
			if (other.libellePoulle != null) {
				return false;
			}
		} else if (!this.libellePoulle.equals(other.libellePoulle)) {
			return false;
		}
		return true;
	}

}
