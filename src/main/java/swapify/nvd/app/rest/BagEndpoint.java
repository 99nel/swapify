package swapify.nvd.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import swapify.nvd.app.model.Bag;
import swapify.nvd.app.persistence.BagService;

@RestController
@RequestMapping("api/bag")
public class BagEndpoint {
	
	@Autowired
	private BagService bs;
	
	@GetMapping("/:Id")
	public void getBagById(@PathVariable("Id")long Id) {
		System.out.println("I'm a pickle Pickleriiiiick");
	}
	
	@PostMapping
	public void saveBag(@RequestBody Bag newBag) {
		bs.saveBag(newBag);
		System.out.println(newBag);
	}
	
	@GetMapping
	public List<Bag> getBagAll() {
		bs.getBagAll();
		System.out.println("alle tassen verzamelen is gelukt!");
		return bs.getBagAll();

	}
	
}
