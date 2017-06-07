package edu.mum.service;

import java.util.List;

import edu.mum.domain.User;
 
public interface UserService {
	void save(User user);
	List<User> findAll();
	User findOne(Long id);
	User findByEmail(String email);
	User findByName(String name);
	User update(User user);
	User testRefresh(User user);
	void saveFull(User user);
}
