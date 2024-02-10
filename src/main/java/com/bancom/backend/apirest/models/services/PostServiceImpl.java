package com.bancom.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bancom.backend.apirest.models.dao.IPostDao;
import com.bancom.backend.apirest.models.entity.Post;


@Service
public class PostServiceImpl implements IPostService {

	@Autowired
	private IPostDao postDao;

	@Override
	@Transactional(readOnly = true)
	public List<Post> findAll() {
		return (List<Post>) postDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Post> findAllByIdUser(int id) {
		return (List<Post>) postDao.findAllByIdUser(id);
	}

	@Override
	@Transactional
	public Post save(Post post) {
		return postDao.save(post);
	}

	@Override
	@Transactional
	public void deletePost(Long idPost, Long idUser) {
		postDao.deletePost(idPost, idUser);
	}

}
