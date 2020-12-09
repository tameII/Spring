package com.trucmuche.art.repository;


import com.trucmuche.art.model.Painting;
import org.springframework.data.repository.CrudRepository;

public interface ArtRepository extends CrudRepository<Painting, Integer> {

    Iterable<Painting> findAllByAuthor(String author);
    Painting findById(int id);

    void deleteById(int id);
}
