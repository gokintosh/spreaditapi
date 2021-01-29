package com.gokul.backend.repository;

import com.gokul.backend.models.Post;
import com.gokul.backend.models.User;
import com.gokul.backend.models.Vote;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VoteRepository extends CrudRepository<Vote,Long> {
    Optional<Vote>findTopByPostAndAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
