package com.example.repository;

import com.example.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dougmolina on 12/17/16.
 */
public interface PostRepository extends CrudRepository<Post, Long>{

    //AUTHOR
    List<Post> findAllByAuthorFirstName(String first);

    List<Post>  findAllByAuthorFirstNameIgnoreCaseOrderByPostedOnDesc(String first);

    //KEYWORDS


    //ACTIVE


    //QUERY

}
