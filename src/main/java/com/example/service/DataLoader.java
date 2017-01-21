package com.example.service;

import com.example.model.Author;
import com.example.model.Post;
import com.example.repository.AuthorRepository;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by dougmolina on 12/17/16.
 */

@Service
public class DataLoader {


    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData(){

        //create an author
        Author dv = new Author("Mark", "Twain");
        authorRepository.save(dv);

        //create a post
        Post post = new Post("Pare de Sufrir!, Muchacho");
        post.setBody("Post body here....");
        post.setPostedOn(new Date());
        post.setAuthor(dv);

        postRepository.save(post);
    }


}
