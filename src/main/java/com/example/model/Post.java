package com.example.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dougmolina on 12/17/16.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    private Date postedOn;

    @ManyToOne
    @JsonManagedReference
    private Author author;

    //private constructor needed by JPA
    private Post(){

    }

    public Post(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postedOn=" + postedOn +
                ", author=" + author +
                '}';
    }
}
