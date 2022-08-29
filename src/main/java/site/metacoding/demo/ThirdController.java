package site.metacoding.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.demo.domain.Third;

// 고급 데이터 받기 (json, x-www-form-urlencoded, text)

@RestController
public class ThirdController {
	
	//강의 다시보면서 서블릿 역활 직접 적어보기 

	@GetMapping("/third/{id}")
	public String getData(@PathVariable Integer id) {
		return "id : "+id;
	}
	
	@PostMapping("/third")
	public String postData(Third third) {
		return "id : " + third.getId() +", title : " + third.getTitle() + ", content : " + third.getContent();
	}
	
	// UPDATE third SET title =?, content = ?, WHERE id =?
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id,@RequestBody Third third) {
		return third.toString();
	}
}
