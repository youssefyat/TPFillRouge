package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Equipe;

public interface EquipeDao {

	public int createEquipe(Equipe equipe);

	public ArrayList<Equipe> getAllEquipes();

	public Equipe getEquipeById(int id);
}
