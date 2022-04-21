package com.app.nile.service;

import java.util.List;

import com.app.nile.model.Product;

public interface ProdService {
	
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Long productId);
	public List<Product> showProducts();

}
