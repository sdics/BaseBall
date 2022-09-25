package site.metacoding.BaseBall.domain.player;

import java.util.List;

import site.metacoding.BaseBall.web.dto.response.PlayerListDto;

public interface PlayerDao {
	public void insert(Player player);

	public List<Player> findAll();
	
	public List<PlayerListDto> findAllplusTeam();

	public Player findById(Integer id);

	public void update(Player player);

	public void deleteById(Integer id);

	public void updateByPlayeroutId(Integer id);

}
