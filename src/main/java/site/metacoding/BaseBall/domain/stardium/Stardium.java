package site.metacoding.BaseBall.domain.stardium;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stardium {
	public Integer id;
	public String name;
	public Integer since;
	public String teamname;
	
	public Stardium(String name) {
		this.name = name;
	}
}
