package site.metacoding.BaseBall.domain.team;

import java.util.List;

import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.domain.stardium.StardiumDao;

public interface TeamDao {
	public void insert(Team team);

	public List<Team> findAll();

	public Team findById(Integer id);

	public void update(Team team);

	public void deleteById(Integer id);

	public void updateByPlayeroutId(Integer id);
}
