package site.metacoding.BaseBall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.domain.stardium.StardiumDao;
import site.metacoding.BaseBall.web.dto.request.stardium.SaveDto;

@Service
@RequiredArgsConstructor
public class StardiumService {

	private final StardiumDao stardiumDao;
	
	public List<Stardium> 경기장목록보기() {
		return stardiumDao.findAll();
	}
	
	public void 경기장등록(SaveDto saveDto) {
		Stardium stardium = saveDto.toEntity(saveDto.getName());
		stardiumDao.insert(stardium);
	}
	
	public void 경기장삭제(Integer id) {
		stardiumDao.deleteById(id);
	}
	
}
