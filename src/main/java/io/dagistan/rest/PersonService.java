package io.dagistan.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dagistan.model.Person;
import io.dagistan.repository.PersonRepository;

@RestController
@RequestMapping("/api")
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	@GetMapping("/person")
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	@PostMapping("/person")
	public Person createPerson(@Valid @RequestBody Person person) {
		return personRepository.save(person);
	}

	@GetMapping(value = "/person/{id}")
	public ResponseEntity<Person> getPersonById(@PathVariable("id") String id) {
		Person person = personRepository.findOne(id);
		if (person == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(person, HttpStatus.OK);
		}
	}

	@PutMapping(value = "/person/{id}")
	public ResponseEntity<Person> updatePerson(@PathVariable("id") String id, @Valid @RequestBody Person person) {
		Person personData = personRepository.findOne(id);
		if (personData == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		personData.setName(person.getName());
		personData.setSurname(person.getSurname());
		Person updatedTodo = personRepository.save(personData);
		return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
	}

	@DeleteMapping(value = "/person/{id}")
	public void deletePerson(@PathVariable("id") String id) {
		personRepository.delete(id);
	}

}
