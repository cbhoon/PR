package com.ground.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ground.entity.Post;

@Repository
public interface BoardRepository extends JpaRepository<Post, Integer>{
	
	Page<Post> findByTitleContaining(String searchKeyword, Pageable pageable);
	
}
