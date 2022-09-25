package site.metacoding.BaseBall.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CMRestDto<T> {
	private Integer code;
	private String msg;
	private T data;
}
