/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.repository;

import com.hackathon.model.Movies;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author techsavanna
 */
@Repository
public interface MoviesRepository extends JpaRepository<Movies,Long> {
    @Query(
              value = "SELECT m.id,m.title,m.description,m.recommendation,m.rating,m.username  from movies m WHERE m.title = :title",
              nativeQuery = true)
    Movies findByTitle(@Param("title") String title);
    
     @Query(
              value = "SELECT m.id,m.title,m.description,m.recommendation,m.rating,m.username  from movies m WHERE m.username = :username",
              nativeQuery = true)
   Optional<Movies> findByUsername(@Param("username") String username);
   
    @Query(
              value = "SELECT m.id,m.title,m.description,m.recommendation,m.rating,m.username,m.watch_flag  from movies m WHERE m.watch_flag = :watch_flag",
              nativeQuery = true)
   Optional<Movies> findByWatchFlag(@Param("watch_flag") String watch_flag);
}
