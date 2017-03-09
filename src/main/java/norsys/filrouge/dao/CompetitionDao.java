package norsys.filrouge.dao;

import java.util.ArrayList;
import java.util.Optional;

import norsys.filrouge.entities.Competition;

public interface CompetitionDao {

	public int createCompetition(Competition competition);

	public ArrayList<Competition> getAllCompetitions();

	public Optional<Competition> getCometitionById(int id);

}
