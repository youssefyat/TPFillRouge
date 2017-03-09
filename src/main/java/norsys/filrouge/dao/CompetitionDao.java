package norsys.filrouge.dao;

import java.util.ArrayList;

import norsys.filrouge.entities.Competition;

public interface CompetitionDao {

	public int createCompetition(Competition competition);

	public ArrayList<Competition> getAllCompetitions();

	public Competition getCometitionById(int id);

}
