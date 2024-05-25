package com.rest.demo.repositories;

import com.rest.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository extends JpaRepository <Person, Long>{
}
