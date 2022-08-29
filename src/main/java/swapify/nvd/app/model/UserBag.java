package swapify.nvd.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserBag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private int bagId;

	@OneToMany
	private List<Bag> bag;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBagId() {
		return bagId;
	}
	public void setBagId(int bagId) {
		this.bagId = bagId;
	}

}
