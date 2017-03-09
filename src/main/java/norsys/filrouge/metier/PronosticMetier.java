package norsys.filrouge.metier;

import java.util.ArrayList;
import java.util.Scanner;

import norsys.filrouge.entities.Personne;
import norsys.filrouge.entities.Pronostic;
import norsys.filrouge.entities.Rencontre;
import norsys.filrouge.service.PersonneService;
import norsys.filrouge.service.PronosticService;
import norsys.filrouge.service.RencontreService;

public class PronosticMetier {
	static final PersonneService personneService = new PersonneService();
	static final RencontreService rencontreService = new RencontreService();
	static final PronosticService pronosticService = new PronosticService();
	static ArrayList<Pronostic> listPronosticParPersonne = null;
	static int scoreGlobal;

	public static void afficherListRencontre(ArrayList<Rencontre> listRencontre) {
		listRencontre.forEach(rencontre -> afficherRencontre(rencontre));
	}

	public static void afficherListRencontreAvecBut(ArrayList<Rencontre> listRencontre) {
		listRencontre.forEach(rencontre -> afficherRencontreAvecBut(rencontre));
	}

	public static void afficherRencontre(Rencontre rencontre) {
		System.out.println(
				rencontre.getEquipe1().getLibelleEquipe() + " VS " + rencontre.getEquipe2().getLibelleEquipe());
	}

	public static void afficherRencontreAvecBut(Rencontre rencontre) {
		System.out.println(rencontre.getEquipe1().getLibelleEquipe() + " " + rencontre.getButEquipe1() + " VS "
				+ rencontre.getButRquipe2() + " " + rencontre.getEquipe2().getLibelleEquipe());
	}

	public static void SaisirPronostic(ArrayList<Rencontre> listRencontre, Personne personne) {
		Scanner scanner = new Scanner(System.in);
		listRencontre.forEach(rencontre -> {
			Pronostic pronostic = new Pronostic();
			pronostic.setPersonne(personne);
			pronostic.setRencontre(rencontre);
			pronostic.setScore(0);
			afficherRencontre(rencontre);

			System.out.println("But Equipe " + rencontre.getEquipe1().getLibelleEquipe() + " :");
			pronostic.setButEquipe1(scanner.nextInt());
			System.out.println("But Equipe " + rencontre.getEquipe2().getLibelleEquipe() + " :");
			pronostic.setButEquipe2(scanner.nextInt());

			pronosticService.createPronostic(pronostic);

		});
	}

	public static Pronostic calculeScorePronostic(Pronostic pronostic) {
		Rencontre rencontre = pronostic.getRencontre();

		if (rencontre.getButEquipe1() == pronostic.getButEquipe1()
				&& rencontre.getButRquipe2() == pronostic.getButEquipe2()) {
			pronostic.setScore(3);

		} else if (rencontre.getButEquipe1() - rencontre.getButRquipe2() == pronostic.getButEquipe1()
				- pronostic.getButEquipe2()) {
			pronostic.setScore(2);

		} else if (rencontre.getButEquipe1() > pronostic.getButEquipe2()
				|| pronostic.getButEquipe1() > rencontre.getButRquipe2()) {
			pronostic.setScore(1);
		}
		return pronostic;

	}

	public static void main(String args[]) {
		ArrayList<Rencontre> listRencontre = rencontreService.getAllRencontres();
		ArrayList<Personne> listPersonne = personneService.getAllPersonne();

		System.out.println("Bienvenu dans notre application");

		// parcourir les personnes pour pronostiqué
		listPersonne.forEach(personne -> {
			System.out.println("Salarié : " + personne.getNomPersonne() + " " + personne.getPrenomPersonne());
			System.out.println("Liste des Rencontres : ");
			afficherListRencontre(listRencontre);
			System.out.println("Donnez un pronostic pour chaque Rencontre : ");
			SaisirPronostic(listRencontre, personne);
			System.out.println("Fin pour Salarié : " + personne.getNomPersonne() + " " + personne.getPrenomPersonne());
		});
		// affichage des but reel des rencontres
		System.out.println("Liste des Rencontres Avec But : ");
		afficherListRencontreAvecBut(listRencontre);

		// Calcule du Score pour chaque Personne
		listPersonne.forEach(personne -> {
			listPronosticParPersonne = pronosticService.getPronosticsByPersonne(personne);
			scoreGlobal = 0;
			listPronosticParPersonne.forEach(pronostic -> {
				Pronostic pronosticAvecScore = calculeScorePronostic(pronostic);
				scoreGlobal += pronosticAvecScore.getScore();
				pronosticService.editePronostic(pronosticAvecScore);
			});
			personne.setScoreGlobal(scoreGlobal);
			personneService.editePersonne(personne);
		});
		// Affichage des Scores et Calssement
		listPersonne = personneService.getAllPersonne();// les personnes avec
														// Score
		listPersonne.stream().sorted((p1, p2) -> {
			return p1.getScoreGlobal() > p2.getScoreGlobal() ? 1 : 0;
		}).forEach(personne -> {
			System.out.println("Salarié : " + personne.getNomPersonne() + " " + personne.getPrenomPersonne()
					+ " Score Global" + personne.getScoreGlobal());
		});
	}
}
