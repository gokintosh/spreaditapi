package com.gokul.backend.repository;

import com.github.javafaker.Options;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Subrediit extends CrudRepository<Subrediit,Long> {
    Optional<Subrediit> findByName(String subredditName);
}
