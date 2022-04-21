package com.app.nile.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nile.model.Product;
import com.app.nile.repos.ProductJpaRepo;

@Service
@Transactional
public class ProdServiceImpl implements ProdService {
	
	@Autowired
	ProductJpaRepo prodRepo;

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		prodRepo.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		prodRepo.save(product);
		return true;
	}

	@Override
	public boolean deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		prodRepo.deleteById(productId);
		return true;
	}

	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

}
