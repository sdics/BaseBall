package site.metacoding.BaseBall.domain.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
	private Integer id;
	private String playername;
	private Integer age;
	private String position;
	private String teamname;
}
