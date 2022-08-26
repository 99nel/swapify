package swapify.nvd.app.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import swapify.nvd.app.model.User;

@Component
public interface UserRepository extends JpaRepository <User, Long>{

}
