package norsys.technomaker.entities;

import java.util.ArrayList;

public class Personne {
	private int						idPersonne;
	private String					nomPersonne;
	private String					prenomPersonne;
	private String					email;
	private String					password;
	private String					role;
	private ArrayList<Pronostic>	pronostics;

	public Personne() {
		super();
	}

	public Personne(int idPersonne, String nomPersonne, String prenomPersonne, String email, String password,
	        String role) {
		super();
		this.idPersonne = idPersonne;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Personne(int idPersonne, String nomPersonne, String prenomPersonne, String email, String password,
	        String role, ArrayList<Pronostic> pronostics) {
		super();
		this.idPersonne = idPersonne;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.email = email;
		this.password = password;
		this.role = role;
		this.pronostics = pronostics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.email == null ? 0 : this.email.hashCode());
		result = prime * result + this.idPersonne;
		result = prime * result + (this.nomPersonne == null ? 0 : this.nomPersonne.hashCode());
		result = prime * result + (this.password == null ? 0 : this.password.hashCode());
		result = prime * result + (this.prenomPersonne == null ? 0 : this.prenomPersonne.hashCode());
		result = prime * result + (this.pronostics == null ? 0 : this.pronostics.hashCode());
		result = prime * result + (this.role == null ? 0 : this.role.hashCode());
		return result;
	}

	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNomPersonne() {
		return this.nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return this.prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<Pronostic> getPronostics() {
		return this.pronostics;
	}

	public void setPronostics(ArrayList<Pronostic> pronostics) {
		this.pronostics = pronostics;
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
		Personne other = (Personne) obj;
		if (this.email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!this.email.equals(other.email)) {
			return false;
		}
		if (this.idPersonne != other.idPersonne) {
			return false;
		}
		if (this.nomPersonne == null) {
			if (other.nomPersonne != null) {
				return false;
			}
		} else if (!this.nomPersonne.equals(other.nomPersonne)) {
			return false;
		}
		if (this.password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!this.password.equals(other.password)) {
			return false;
		}
		if (this.prenomPersonne == null) {
			if (other.prenomPersonne != null) {
				return false;
			}
		} else if (!this.prenomPersonne.equals(other.prenomPersonne)) {
			return false;
		}
		if (this.pronostics == null) {
			if (other.pronostics != null) {
				return false;
			}
		} else if (!this.pronostics.equals(other.pronostics)) {
			return false;
		}
		if (this.role == null) {
			if (other.role != null) {
				return false;
			}
		} else if (!this.role.equals(other.role)) {
			return false;
		}
		return true;
	}

}
