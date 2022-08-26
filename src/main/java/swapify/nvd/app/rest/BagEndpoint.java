package swapify.nvd.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import swapify.nvd.app.model.Bag;

@RestController
public class BagEndpoint {
	
	@GetMapping("/bagtest")
	public void test() {
		System.out.println("I'm a pickle Pickleriiiiick");
	}
	
	@PostMapping("/saveBag")
	public void saveBag(@RequestBody Bag newBag) {
		System.out.println(newBag);
	}
}
