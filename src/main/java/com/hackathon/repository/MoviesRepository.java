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

    Movies findByTitle(String title);
    

   Optional<Movies> findByUsername(String username);
   
 
   Optional<Movies> findByWatchFlag(String watchflag);
}
