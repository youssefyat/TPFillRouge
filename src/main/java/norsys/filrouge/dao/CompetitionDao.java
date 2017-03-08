package norsys.filrouge.dao;

import java.sql.Connection;
import java.util.ArrayList;

import norsys.filrouge.entities.Competition;

public interface CompetitionDao {

	public void setConnection(Connection cn) throws Exception;

	public int createCompetition(Competition competition);

	public ArrayList<Competition> getAllCompetitions();

	public Competition getCometitionById(int id);

}
