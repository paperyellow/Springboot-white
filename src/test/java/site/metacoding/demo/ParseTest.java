package site.metacoding.demo;

import org.junit.jupiter.api.Test;

public class ParseTest {

	@Test
	public void parse_test() {
		String data = "title=spring&content=enjoyspring&id=1";
		
		String[] p1 = data.split("&");
		System.out.println(p1.length);
		
	}
}
