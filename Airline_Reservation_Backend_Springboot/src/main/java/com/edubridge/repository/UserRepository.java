package com.edubridge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    List<User> findByRole(String role);
	static boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	User findByUsernameAndPassword(String username,String password );
	
}
