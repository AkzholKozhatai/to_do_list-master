package com.akzhol.blog.repository;

import com.akzhol.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
