package norsys.technomaker.entities;

public class Personne {
	private int idPersonne;
	private final String nomPersonne;
	private final String prenomPersonne;
	private final String email;
	private final String passwd;
	private final String role;

	public Personne(int idPersonne, String nomPersonne, String prenomPersonne, String email, String passwd,
			String role) {
		super();
		this.idPersonne = idPersonne;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.email = email;
		this.passwd = passwd;
		this.role = role;
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

	public String getPrenomPersonne() {
		return this.prenomPersonne;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public String getRole() {
		return this.role;
	}

}
