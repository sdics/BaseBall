package site.metacoding.BaseBall.domain.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
	private Integer id;
	private String name;
	private Integer age;
	private String position;
	private Integer teamId;
}
