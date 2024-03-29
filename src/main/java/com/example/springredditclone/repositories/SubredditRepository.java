package com.example.springredditclone.repositories;

import com.example.springredditclone.entities.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit,Long> {
    Optional<Subreddit> findByName(String subredditName);
}
