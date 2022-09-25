package site.metacoding.BaseBall.domain.playerout;

import java.util.List;

import site.metacoding.BaseBall.domain.player.Player;

public interface PlayoutDao {
	public void insert(Playerout stardium);

	public List<Playerout> findAll();

	public Playerout findById(Integer id);

	public void update(Playerout stardium);

	public void deleteById(Integer id);

	public void updateByPlayeroutId(Integer id);
}
