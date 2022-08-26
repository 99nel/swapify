package swapify.nvd.app.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swapify.nvd.app.model.Bag;

@Service
public class BagService {
	
	@Autowired
	private BagRepository br;
	
	public void saveBag(Bag newBag) {
		br.save(newBag);
	}

}
