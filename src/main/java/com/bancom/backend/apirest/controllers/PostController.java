package com.bancom.backend.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancom.backend.apirest.models.entity.Post;
import com.bancom.backend.apirest.models.services.IPostService;

@RestController
@RequestMapping("/api")

public class PostController {

	@Autowired
	private IPostService postService;

	//listar
	@GetMapping("/post")
	public List<Post> index() {
		return postService.findAll();
	}

}
