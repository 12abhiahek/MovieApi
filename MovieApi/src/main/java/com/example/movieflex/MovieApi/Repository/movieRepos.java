package com.example.movieflex.MovieApi.Repository;

import com.example.movieflex.MovieApi.Entity.movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepos extends JpaRepository<movie,Integer> {
}
