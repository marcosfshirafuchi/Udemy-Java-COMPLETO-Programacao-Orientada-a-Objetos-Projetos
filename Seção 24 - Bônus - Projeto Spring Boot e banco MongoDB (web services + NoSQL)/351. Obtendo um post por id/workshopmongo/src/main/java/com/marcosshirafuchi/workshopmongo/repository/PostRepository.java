package com.marcosshirafuchi.workshopmongo.repository;

import com.marcosshirafuchi.workshopmongo.domain.Post;
import com.marcosshirafuchi.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
