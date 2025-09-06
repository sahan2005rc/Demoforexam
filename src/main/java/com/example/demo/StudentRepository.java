package com.example.demo;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//Remove @RepositoryRestResource below to disable auto REST api:
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{}