package com.bancom.backend.apirest.models.services;

import java.util.List;

import com.bancom.backend.apirest.models.entity.User;

public interface IUserService {

	public List<User> findAll();
	
	public User findById(Long id);
	
	public User save(User cliente);
	
	public void delete(Long id);
	
}
