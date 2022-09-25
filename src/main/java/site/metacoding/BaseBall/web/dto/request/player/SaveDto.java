package site.metacoding.BaseBall.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.BaseBall.domain.stardium.Stardium;

@Getter
@Setter
public class SaveDto {

		private String name;
		
		public void toEntity(String name) {
				Stardium stardium = new Stardium(this.name);
		}
	
}
