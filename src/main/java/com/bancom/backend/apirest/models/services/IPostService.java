package com.bancom.backend.apirest.models.services;

import java.util.List;

import com.bancom.backend.apirest.models.entity.Post;

public interface IPostService {

	public List<Post> findAll();
	
	public List<Post> findAllByIdUser(int id);
	
	public Post save(Post post);
	
	public void deletePost(Long idPost, Long idUser);
	
}
