package com.app.nile.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nile.model.User;
import com.app.nile.repos.SignUpJpaRepo;

@Service
@Transactional
public class SignUpServiceImpl implements SignUpService{
	
	@Autowired
	SignUpJpaRepo signUpRepo;

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		signUpRepo.save(user);
		return true;
	}

	@Override
	public boolean UpdateUser(User user) {
		// TODO Auto-generated method stub
		signUpRepo.save(user);
		return true;
	}


	@Override
	public List<User> showUsers() {
		// TODO Auto-generated method stub
		return signUpRepo.findAll();
	}

	@Override
	public boolean deleteUser(Long Id) {
		// TODO Auto-generated method stub
		signUpRepo.deleteById(Id);
		return true;
	}

}
