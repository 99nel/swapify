package swapify.nvd.app.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import swapify.nvd.app.model.Bag;

@Component
public interface BagRepository extends JpaRepository <Bag, Long>{

}


