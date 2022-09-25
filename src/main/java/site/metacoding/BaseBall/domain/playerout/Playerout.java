package site.metacoding.BaseBall.domain.playerout;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Playerout {
	public Integer id;
	public String name;
	public String reason;
	public String position;
	public Timestamp createdate;
	
	public Playerout(String name) {
		this.name = name;
	}
}
