package com.bancom.backend.apirest.models.services;

import com.bancom.backend.apirest.models.entity.User;

public interface IUsuarioService {

	public User findByUsername(String username);
}
