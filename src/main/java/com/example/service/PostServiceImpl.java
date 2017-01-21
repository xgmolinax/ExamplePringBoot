package com.example.service;

import com.example.model.Post;
import com.example.repository.AuthorRepository;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dougmolina on 12/17/16.
 */
@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Post> list() {
        return postRepository.findAll();
    }

    @Override
    public Post create(Post post) {
        //save the new author
        authorRepository.save(post.getAuthor());
        return postRepository.save(post);

    }

    @Override
    public Post read(long id) {
        return postRepository.findOne(id);
    }

    @Override
    public Post update(long id, Post update) {
        Post post = postRepository.findOne(id);
        if (update.getTitle() != null){
            post.setTitle(update.getTitle());
        }

        return postRepository.save(post);
    }

    @Override
    public void delete(long id) {
          postRepository.delete(id);
    }

    @Override
    public List<Post> byAuthor(String first) {
        return postRepository.findAllByAuthorFirstNameIgnoreCaseOrderByPostedOnDesc(first);
    }
}
