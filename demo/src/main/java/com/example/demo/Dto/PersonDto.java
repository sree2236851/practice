package com.example.demo.Dto;

import java.util.List;

import com.example.demo.model.Person;

public class PersonDto {
	private List<Person> Person;

    public void addPerson(Person person) {
        this.Person.add(person);
    }

	public PersonDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonDto(List<com.example.demo.model.Person> person) {
		super();
		Person = person;
	}

	public List<Person> getPerson() {
		return Person;
	}

	public void setPerson(List<Person> person) {
		Person = person;
	}
    
}
