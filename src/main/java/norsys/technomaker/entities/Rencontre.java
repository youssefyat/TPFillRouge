package norsys.technomaker.entities;

import java.sql.Time;

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
public class Rencontre {
	private int idRencontre;
	private Time dateDebut;
	private Time dateFin;
	private int butEquipe1;
	private int butRquipe2;
	Equipe equipe1;
	Equipe equipe2;
	Poulle poulle;

}
