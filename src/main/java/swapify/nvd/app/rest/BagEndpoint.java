package swapify.nvd.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BagEndpoint {
	
	@GetMapping("/bagtest")
	public void test() {
		System.out.println("I'm a pickle Pickleriiiiick");
	}
}
