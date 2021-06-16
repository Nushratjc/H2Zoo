package com.example.h2zoo.repository;


import com.example.h2zoo.model.Bird;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {
}
