package norsys.technomaker.dao;

import java.util.ArrayList;

import norsys.technomaker.entities.Competition;

public interface CompetitionDao {
	public int createCompetition(Competition competition);

	public ArrayList<Competition> getAllCompetitions();

	public Competition getCometitionById(int id);

}
