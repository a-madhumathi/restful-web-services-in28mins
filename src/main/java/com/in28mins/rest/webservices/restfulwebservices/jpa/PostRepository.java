package com.in28mins.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28mins.rest.webservices.restfulwebservices.user.Post;
import com.in28mins.rest.webservices.restfulwebservices.user.User;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
	public Post findByUserAndId(User user, Integer id);

}
