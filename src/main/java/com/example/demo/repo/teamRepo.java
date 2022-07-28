package com.example.demo.repo;

import com.example.demo.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teamRepo extends JpaRepository<Team, String> {

}
