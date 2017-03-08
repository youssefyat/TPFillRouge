package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Competition;

public interface Rencontre {
	public int createRencontre(Rencontre rencontre);

	public ArrayList<Rencontre> getAllRencontres();

	public Competition getRencontreById(int id);
}
