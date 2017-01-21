package com.example.service;

import com.example.model.Post;

import java.util.List;

/**
 * Created by dougmolina on 12/17/16.
 */

//CRUD interface
public interface PostService {

    Iterable<Post> list();

    Post create(Post post);

    Post read(long id);

    Post update(long id, Post post);

    void delete(long id);

    List<Post> byAuthor(String first);
}
