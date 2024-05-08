package com.edubridge.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.User;
import com.edubridge.repository.UserRepository;
import com.edubridge.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


	@Override
	public User create(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findById(id).get();
	}

	@Override
	public String deleteUserById(Integer id) {
		 userRepository.deleteById(id);
		 return("Deleted Successfully");
	}

	@Override
	public User loginUser(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
	}

	@Override
	public User updateUser(User updatedUser) {
		return null;
	}

	@Override
	public String updateUserById(Integer id) {
		return null;
	}


	@Override
	public List<User> deleteUser(int id) {
		return null;
	}

	@Override
	public List<User> getUsersByRole(String role) {
		return null;
	}

	
	@Override
	public User findbyusername(String username, String password) {
		return null;
	}

	
}

