package site.metacoding.BaseBall.domain.team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Team {
	public Integer id;
	public String name;
	public Integer since;
	public String hometown;
	private Integer stardiumId;
	
	public Team(Integer stardiumId, String name) {
			this.stardiumId = stardiumId;
			this.name = name;
	}
}
