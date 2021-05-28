package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@RequestMapping("/login")
	public String login() {
		return "login";

	}
	
	@RequestMapping("/login2")
	public String login2() {
		return "login";

	}

}
