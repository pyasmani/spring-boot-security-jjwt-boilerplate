package cu.pyasmani.springbootsecurityjjwtboilerplate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/home")
	public String home() {
		return "This is the home end point not your API's";
	}
	
}
