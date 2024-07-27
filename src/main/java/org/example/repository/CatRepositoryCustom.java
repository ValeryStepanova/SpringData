package org.example.repository;

import org.example.entity.Cat;

import java.util.List;

public interface CatRepositoryCustom {
    List<Cat> findByName(String name);
}
