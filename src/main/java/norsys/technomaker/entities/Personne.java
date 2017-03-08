package norsys.technomaker.entities;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Personne {
	private int idPersonne;
	private String nomPersonne;
	private String prenomPersonne;
	private String email;
	private String password;
	private String role;
	private ArrayList<Pronostic> pronostics;

}
