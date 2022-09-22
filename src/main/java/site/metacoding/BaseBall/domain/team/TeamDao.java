package site.metacoding.BaseBall.domain.team;

import java.util.List;

import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.domain.stardium.StardiumDao;

public interface TeamDao {
	public void insert(TeamDao teamDao);

	public List<Team> findAll();

	public Team findById(Integer id);

	public void update(TeamDao teamDao);

	public void deleteById(Integer id);

	public void updateByPlayeroutId(Integer id);
}
