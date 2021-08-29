package cu.pyasmani.springbootsecurityjjwtboilerplate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {

	@RequestMapping("")
	public String v1() {
		return "This is the version one of your API";
	}

	@RequestMapping("/v2")
	public String v2() {
		return "This is the version two of your API";
	}

}
