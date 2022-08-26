package swapify.nvd.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import swapify.nvd.app.model.User;
import swapify.nvd.app.persistence.UserService;

@RestController
public class UserEndpoint {
	
	@Autowired
	private UserService us;
	
	@GetMapping("/usertest")
	public void test() {
		System.out.println("WUBBALUBBADUBDUB");
	}
	
	@PostMapping("/saveusertest")
		public void saveUser(User newUser) {
		System.out.println("get schwifty");
		us.saveUser(newUser);
	}
}
