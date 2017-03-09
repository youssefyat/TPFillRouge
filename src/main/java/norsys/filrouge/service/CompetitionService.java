package norsys.filrouge.service;

import java.util.ArrayList;

import norsys.filrouge.dao.CompetitionDao;
import norsys.filrouge.dao.CompetitionDaoImp;
import norsys.filrouge.entities.Competition;
import norsys.filrouge.util.ConnectionManagerJDBC;

public class CompetitionService {
	private final CompetitionDao competitionDao;

	public CompetitionService() {
		this.competitionDao = new CompetitionDaoImp(ConnectionManagerJDBC.getInstance().getConnection());
	}

	public Competition getCometition(int id) {
		return this.competitionDao.getCometitionById(id);
	}

	public ArrayList<Competition> getAllComititions() {
		return this.competitionDao.getAllCompetitions();
	}
}
