package com.example.demo.repo;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studRepo extends JpaRepository<Student, String> {

}
