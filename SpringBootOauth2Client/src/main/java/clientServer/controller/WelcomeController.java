package clientServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import clientServer.config.WelcomeClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class WelcomeController {
	
	private final WelcomeClient welcomeClient;
	
	@GetMapping("/test")
	public String welcome() {
		
		String welcome = welcomeClient.getWelcome();			
		return "<h1>" +  welcome + "</h1>";
	}

	@GetMapping("/testing")
	public String welcome2() {
		
		String welcome = welcomeClient.getWelcome2();			
		return "<h3>" +  welcome + "</h3>";
	}
	
}
