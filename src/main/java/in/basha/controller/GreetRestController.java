package in.basha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.basha.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	
	@Autowired
	private WelcomeFeignClient welcomeFeignClient;
	
	
	@GetMapping("/greet/{name}")
	public String getGreetMsg(@PathVariable String name) {
		String welcomeMsg=welcomeFeignClient.getWelcomeMsg();
		String greetMsg=name + "Welcome to Symphonize   ,";
		return greetMsg +welcomeMsg+"  ";
	}

}
