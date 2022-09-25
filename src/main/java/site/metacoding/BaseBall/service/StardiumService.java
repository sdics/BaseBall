package site.metacoding.BaseBall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.BaseBall.domain.stardium.Stardium;
import site.metacoding.BaseBall.domain.stardium.StardiumDao;

@Service
@RequiredArgsConstructor
public class StardiumService {

	private final StardiumDao stardiumDao;
	
	public List<Stardium> 경기장목록보기() {
		return stardiumDao.findAll();
	}
	
}
