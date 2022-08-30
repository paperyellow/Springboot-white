package site.metacoding.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor //setter가 없어도 여기서 초기화 가능
@Getter // 없으면 json으로 컴버팅이 안됨.
public class RespDto<T> {
	private Integer code; // -1 실패, 1 성공
	private String msg; // 통신 결과를 메시지로 담기 
	private String body;
}
