package norsys.filrouge.dao;

import java.util.ArrayList;

import norsys.filrouge.entities.Poulle;

public interface PolleDao {
	public int createPoulle(Poulle poulle);

	public ArrayList<Poulle> getAllPoulles();

	public Poulle getPoulleById(int id);
}
