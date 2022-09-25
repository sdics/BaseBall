package site.metacoding.BaseBall.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.service.StardiumService;
import site.metacoding.BaseBall.web.dto.request.stardium.SaveDto;

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
	
	@GetMapping("/stardium/saveForm")
	public String save(SaveDto saveDto) {
		stardiumService.경기장등록(saveDto);
		return "redirect:stardium";
	}
	
	@DeleteMapping("/stardium/{id}/delete")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer id) {
		stardiumService.경기장삭제(id);
		 return new CMRespDto<>(1, " 경기장 삭제 완료", null);
	}
	
	
	
	
}
