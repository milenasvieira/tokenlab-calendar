package net.guides.springboot.loginregistrationspringbootauthjsp.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import net.guides.springboot.loginregistrationspringbootauthjsp.model.User;
import net.guides.springboot.loginregistrationspringbootauthjsp.repository.UserRepository;

@Service
public class UserServiceImpl implements net.guides.springboot.loginregistrationspringbootauthjsp.service.UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
