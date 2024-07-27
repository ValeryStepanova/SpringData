package org.example.repository;

import org.example.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface CatRepository extends CrudRepository<Cat, Integer>, CatRepositoryCustom {
    Cat findCatByAge(int age);
    Cat findCatByNameContaining(String name); //or Like is same
    Cat findCatByNameContainingIgnoreCase(String name);

    List<Cat> findAllByName(String name);
}
