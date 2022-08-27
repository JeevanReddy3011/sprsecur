package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String fullName) throws UsernameNotFoundException {
		Optional<User>user=userRepository.findByFullName(fullName);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found:" + fullName));
		return user.map(MyUserDetails::new).get();
	}

	

}
