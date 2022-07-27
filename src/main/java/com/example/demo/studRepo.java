package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studRepo extends JpaRepository<Student, String> {

}
