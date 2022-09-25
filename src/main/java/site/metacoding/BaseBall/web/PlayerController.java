package site.metacoding.BaseBall.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.service.PlayerService;
import site.metacoding.BaseBall.web.dto.response.PlayerListDto;

@Controller
@RequiredArgsConstructor
public class PlayerController {

		private final PlayerService playerService;
		
		@GetMapping("/player")
		public String getPlayerList(Model model) {
			List<PlayerListDto> playerList = playerService.선수목록보기();
			model.addAttribute("playerList",playerList);
			return "player/playerList";
			
		}
		
		@GetMapping("player/saveForm")
		public String saveForm() {
			return "player/playersaveForm";
		}
		
		
		
}
