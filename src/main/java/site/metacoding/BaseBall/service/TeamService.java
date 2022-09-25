package site.metacoding.BaseBall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.domain.stardium.StardiumDao;
import site.metacoding.BaseBall.domain.team.Team;
import site.metacoding.BaseBall.domain.team.TeamDao;
import site.metacoding.BaseBall.web.dto.request.player.SaveDto;
import site.metacoding.BaseBall.web.dto.response.TeamListDto;

@Service
@RequiredArgsConstructor
public class TeamService {
	
	private final TeamDao teamDao;
	private final StardiumDao stardiumDao;
	
	public void 팀등록(SaveDto saveDto) {
		Team team = saveDto.toEntity(saveDto.getStardiumId(), saveDto.getName());
		teamDao.insert(team);
		
	}
	
	public List<TeamListDto> 팀목록보기() {
		return teamDao.findAllPlusStadium();
	}
	
	public List<Stardium> 팀등록시구장목록보기() {
		return stardiumDao.findAll();
		}
}
