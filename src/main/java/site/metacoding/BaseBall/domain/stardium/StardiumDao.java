package site.metacoding.BaseBall.domain.stardium;

import java.util.List;

import site.metacoding.BaseBall.domain.playerout.Playerout;

public interface StardiumDao {
	public void insert(Stardium stardium);

	public List<Stardium> findAll();

	public Stardium findById(Integer id);

	public void update(Stardium stardium);

	public void deleteById(Integer id);

	public void updateByPlayeroutId(Integer id);
}
