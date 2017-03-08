package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Rencontre;

public interface RencontreDao {
	public int createRencontre(Rencontre rencontre);

	public ArrayList<Rencontre> getAllRencontres();

	public Rencontre getRencontreById(int id);
}
