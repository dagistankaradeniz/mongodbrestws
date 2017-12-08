package io.dagistan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Person")
@Getter // lombok api getter auto creator
@Setter // lombok api setter auto creator
@NoArgsConstructor // lombok api no args constructor auto creator
public class Person {

	@Id
	private String id;
	private String name;
	private String surname;

}
