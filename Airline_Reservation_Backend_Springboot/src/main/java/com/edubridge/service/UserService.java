package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.User;


public interface UserService {
    
public User create(User user);
List<User> getAllUsers();

public User updateUser(User updatedUser);
public  List<User> deleteUser(int id);
public User getUserById(Integer id);

public String deleteUserById(Integer id);
public User loginUser(User user);
public String updateUserById(Integer id);
public List<User> getUsersByRole(String role);
public User findbyusername(String username, String password);
}