package com.app.nile.nileController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nile.model.Product;
import com.app.nile.model.User;
import com.app.nile.service.ProdService;
import com.app.nile.service.SignUpService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class NileAppController {
	
	@Autowired
	SignUpService signService;
	
	
	@GetMapping("showUsers")
	public List<User> getUsers(){
		return signService.showUsers();
	}
	
	@PostMapping("addUser")
	public boolean addUser(@RequestBody User user) {
		return signService.addUser(user);
	}
	
	@DeleteMapping("/deleteUser")
	public boolean deleteUser(@RequestBody User user) {
		return signService.deleteUser(user.getId());
	}
	
	@PutMapping("/updateUser")
	public boolean updateUser(@RequestBody User user) {
		return signService.UpdateUser(user);
	}
	
	@Autowired
	ProdService pService;
	
	@GetMapping("showProducts")
	public List<Product> showProducts(){
		return pService.showProducts();
	}
	
	@PostMapping("addProduct")
	public boolean addProduct(@RequestBody Product product) {
		return pService.addProduct(product);
	}
	
	@DeleteMapping("/deleteProduct")
	public boolean deleteProduct(@RequestBody Product product) {
		return pService.deleteProduct(product.getProductId());
	}
	
	@PutMapping("/updateProduct")
	public boolean updateProduct(@RequestBody Product product) {
		return pService.updateProduct(product);
	}
	
}
