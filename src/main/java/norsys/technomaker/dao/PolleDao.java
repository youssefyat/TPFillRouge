package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Poulle;

public interface PolleDao {
	public int createPoulle(Poulle poulle);

	public ArrayList<Poulle> getAllPoulles();

	public Poulle getPoulleById(int id);
}
