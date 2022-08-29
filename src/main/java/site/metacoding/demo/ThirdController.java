package site.metacoding.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

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
	
	//강의 다시보면서 서블릿 역할 직접 적어보기 

	@GetMapping("/third/{id}")
	public String getData(@PathVariable Integer id) {
		return "id : "+id;
	}
	
	@PostMapping("/third")
	public String postData(HttpServletRequest request) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(request.getInputStream())
			);
			//title=spring&content=enjoyspring&id=1
			String data = br.readLine();
			System.out.println(data);
			
			
			
			Third third = new Third();
			third.setTitle(null);
			third.setContent(null);
			third.setId(null);
		} catch (Exception e) {
			
		}
		return "hello"; //의미없는 출력문
	}
	
//	@PostMapping("/third")
//	public String postData(Third third) {
//		return "id : " + third.getId() +", title : " + third.getTitle() + ", content : " + third.getContent();
//	}
//	
//	// UPDATE third SET title =?, content = ?, WHERE id =?
//	@PutMapping("/third/{id}")
//	public String putData(@PathVariable Integer id, Third third) {
//		return third.toString();
//	}
	
	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id,@RequestBody Third third) {
		return third.toString();
	}
}
