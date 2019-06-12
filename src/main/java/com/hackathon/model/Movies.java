/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author techsavanna
 */
@Entity
@Table(name="movies",uniqueConstraints = {
    @UniqueConstraint(columnNames = {
        "title"
    })
})
public class Movies {
     @Id
     @GeneratedValue(strategy=  GenerationType.AUTO)
     @Column(name= "id")
     Long id;
     
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "recommendation")
    private String recommendation;
    
    @Column(name = "rating")
    private Integer rating;

     @Column(name = "username")
    private String username;
     
     @Column(name = "watch_flag")
    private String watch_flag;
    public Movies() {
    }

    public Movies(String title, String description, String recommendation, Integer rating, String username, String watch_flag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Movies(String title, String description, Integer rating, String username, String watch_flag) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.username = username;
        this.watch_flag = watch_flag;
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getWatch_flag() {
        return watch_flag;
    }

    public void setWatch_flag(String watch_flag) {
        this.watch_flag = watch_flag;
    }
    
    
}
