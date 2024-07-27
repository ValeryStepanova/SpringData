package org.example.repository;

import junit.framework.TestCase;
import org.example.config.PersistenceConfig;
import org.example.entity.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
public class CatRepositoryTest {

    @Autowired
    private CatRepository catRepository;

    @Test
    public void saveTest() {
        System.out.println(catRepository.findByName("Cat"));
    }

    @Test
    public void findNameContainingIgnoreCaseTest() {
        System.out.println(catRepository.findCatByAge(4));
    }

    @Test
    public void findNameIgnoringCaseTest(){
        System.out.println(catRepository.findCatByNameContainingIgnoreCase("Gf"));
    }
    @Test
    public void findAllByName(){
        System.out.println(catRepository.findAllByName("па"));
    }
}