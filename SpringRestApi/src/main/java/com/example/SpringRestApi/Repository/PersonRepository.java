package com.example.SpringRestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestApi.Model.Person;

public interface PersonRepository extends JpaRepository <Person,Long> {
	
}
