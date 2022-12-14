package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserByUserId(int userId) {
		return userRepository.findByUserId(userId);
	}
	
	public User getUserByMobileNumber(long mobileNumber) {
		return userRepository.findByMobileNumber(mobileNumber);
	}
	
	public Optional<User> getUserByFullName(String fullName){
		return userRepository.findByFullName(fullName);
	}
	
	public User registerUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	public String deleteUserByUserId(int userId) {
		userRepository.deleteById(userId);
		return "user profile with ID "+userId+" is deleted.";
	}
	
	public String deleteAllUsers() {
		userRepository.deleteAll();
		return "All user profiles are deleted.";
	}
}
