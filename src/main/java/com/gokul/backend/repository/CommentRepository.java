package com.gokul.backend.repository;

import com.gokul.backend.models.Comment;
import com.gokul.backend.models.Post;
import com.gokul.backend.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment,Long> {
    List<Comment>findByPost(Post post);
    List<Comment>findByUser(User user);
}
