package com.app.nile.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nile.model.User;

public interface SignUpJpaRepo extends JpaRepository<User, Long>{

}
