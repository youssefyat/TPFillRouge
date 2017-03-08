package norsys.filrouge.dao;

import java.util.ArrayList;

import norsys.filrouge.entities.Equipe;

public interface EquipeDao {

	public int createEquipe(Equipe equipe);

	public ArrayList<Equipe> getAllEquipes();

	public Equipe getEquipeById(int id);
}
