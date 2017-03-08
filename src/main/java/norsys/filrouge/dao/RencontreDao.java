package norsys.filrouge.dao;

import java.util.ArrayList;

import norsys.filrouge.entities.Rencontre;

public interface RencontreDao {
	public int createRencontre(Rencontre rencontre);

	public ArrayList<Rencontre> getAllRencontres();

	public Rencontre getRencontreById(int id);
}
