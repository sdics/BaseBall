package site.metacoding.BaseBall.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.service.TeamService;
import site.metacoding.BaseBall.web.dto.request.player.SaveDto;
import site.metacoding.BaseBall.web.dto.response.TeamListDto;

@Controller
@RequiredArgsConstructor
public class TeamController {
	
	private final TeamService teamService;
	
	
	
	
	
	@GetMapping("/team")
	public String getTeamList(Model model) {
		List<TeamListDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "team/teamList";
	}
	
	@GetMapping("/team/saveForm")
	public String saveForm(Model model) {
		List<Stardium> stardiumList = teamService.팀등록시구장목록보기();
		model.addAttribute("stardiumlist", stardiumList);
		return "team/teamSaveForm";
	}
	
	@PostMapping("/team/save")
	public @ResponseBody CMRestpDto<?> save(@RequestBody SaveDto saveDto){
		teamService.팀등록(saveDto);
		return new CMRespDto<>(1, "팀이 등록되었습니다.", null);
	}
	
}
