package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepository extends ReactiveMongoRepository<Student,String> {
}
