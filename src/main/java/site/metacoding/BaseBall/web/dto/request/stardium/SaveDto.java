package site.metacoding.BaseBall.web.dto.request.stardium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.BaseBall.domain.stardium.Stardium;

@Getter
@Setter
public class SaveDto {
	private String name;

	public Stardium toEntity(String name) {
		Stardium stadium = new Stardium(this.name);
		return stadium;
	}
}