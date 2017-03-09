package norsys.filrouge.dao;

import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.entities.Equipe;

public interface EquipeDao {

	public int createEquipe(Equipe equipe);

	public ArrayList<Equipe> getAllEquipes();

	public Optional<Equipe> getEquipeById(int id);
}
