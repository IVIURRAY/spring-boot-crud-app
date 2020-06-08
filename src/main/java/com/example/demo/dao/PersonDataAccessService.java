package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("someDB")
public class PersonDataAccessService implements PersonDao {
    @Override
    public List<Person> getAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "SOME_REAL_DB"));
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePerson(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }
}
