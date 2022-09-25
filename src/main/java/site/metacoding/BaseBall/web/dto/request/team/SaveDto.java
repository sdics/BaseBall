package site.metacoding.BaseBall.web.dto.request.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.BaseBall.domain.team.Team;

@Getter
@Setter
public class SaveDto {
	private Integer stardiumId;
	private String name;

	public Team toEntity(Integer stardiumId, String name) {
		Team team = new Team(this.stardiumId, this.name);
		return team;
	}
}