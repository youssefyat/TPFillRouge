package norsys.filrouge.dao;

import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.entities.Poulle;

public interface PolleDao {
	public int createPoulle(Poulle poulle);

	public ArrayList<Poulle> getAllPoulles();

	public Optional<Poulle> getPoulleById(int id);
}
