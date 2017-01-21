package com.example.controller;

import com.example.model.Post;
import com.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by dougmolina on 12/17/16.
 */
/*@RestController
@RequestMapping("/posts")*/
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    //@RequestMapping("/")
    public Iterable<Post> list(){
        return postService.list();
    }


   // @RequestMapping("/byAuthor/{first}")
    public Iterable<Post> byAuthor(@PathVariable(value="first") String first){
        return postService.byAuthor(first);
    }

}
