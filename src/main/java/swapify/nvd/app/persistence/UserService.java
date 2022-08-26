package swapify.nvd.app.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swapify.nvd.app.model.User;

@Service
public class UserService{
	
	@Autowired
	private UserRepository ur;
	
	public void saveUser(User newUser) {
		ur.save(newUser);
	}
	

}
