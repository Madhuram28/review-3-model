package com.example.SpringRestApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestApi.Model.Person;
import com.example.SpringRestApi.Repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepo;
	public List<Person> fetchAllPersons()
	{
		return personRepo.findAll();
	}
	public Person savePersons(Person p)
	{
		return personRepo.save(p);
	}
}
