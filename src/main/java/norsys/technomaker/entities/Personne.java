package norsys.technomaker.entities;

public class Personne {
	private int		idPersonne;
	private String	nomPersonne;
	private String	prenomPersonne;
	private String	email;
	private char[]	passwd;
	private String	role;

	public Personne(String nomPersonne, String prenomPersonne, String email, char[] passwd, String role) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.email = email;
		this.passwd = passwd;
		this.role = role;
	}

}
