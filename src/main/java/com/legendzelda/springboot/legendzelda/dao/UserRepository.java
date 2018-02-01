package com.legendzelda.springboot.legendzelda.dao;

import com.legendzelda.springboot.legendzelda.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);
	
	User findByUserNameOrEmail(String username, String email);
	
	User findByUserNameAndEmail(String username, String email);
}
