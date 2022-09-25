package site.metacoding.BaseBall.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.service.StardiumService;

@Controller
@RequiredArgsConstructor
public class StardiumController {
	private final StardiumService stardiumService;
	
	@GetMapping("/stardium")
	public String getStardiumList(Model model) {
		List<Stardium> stardiumList = stardiumService.경기장목록보기();
		model.addAttribute("stardiumList", stardiumList);
		return " stardium/stardiumList";
		
	}
	
	
	
}
