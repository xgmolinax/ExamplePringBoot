package com.example.repository;

import com.example.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dougmolina on 12/17/16.
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {


}
