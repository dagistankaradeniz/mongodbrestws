package io.dagistan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.dagistan.model.Person;

public interface PersonRepository extends MongoRepository<Person, String> {// first arg is db model, second arg is ID
																			// field's data type

}
