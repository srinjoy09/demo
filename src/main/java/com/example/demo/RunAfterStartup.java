package com.example.demo;

import com.example.demo.entity.Team;
import com.example.demo.repo.teamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RunAfterStartup{

    @Autowired
    public teamRepo teamRepo;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        teamRepo.save(new Team("1",0));
        teamRepo.save(new Team("2",0));
        teamRepo.save(new Team("3",0));
        teamRepo.save(new Team("4",0));
        teamRepo.save(new Team("5",0));
        teamRepo.save(new Team("6",0));
        teamRepo.save(new Team("7",0));
    }
}


