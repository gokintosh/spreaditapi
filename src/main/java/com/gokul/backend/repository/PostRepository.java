package com.gokul.backend.repository;

import com.gokul.backend.models.Post;
import com.gokul.backend.models.Subreddit;
import com.gokul.backend.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post,Long> {
    List<Post>findAllBySubreddit(Subreddit subreddit);


    List<Post> findByUser(User user);
}
