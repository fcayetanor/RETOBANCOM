package com.bancom.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bancom.backend.apirest.models.entity.Post;

public interface IPostDao extends JpaRepository<Post, Long>{
	
	@Query("select e from Post e where e.user.id is UPPER(?1) ORDER BY e.id asc")
	public List<Post> findAllByIdUser(int term);
	
	@Modifying
	@Query("delete from Post p where p.id = :idPost and p.user.id = :idUser ")
	void deletePost(@Param("idPost") Long idPost, @Param("idUser") Long idUser);
	
}
