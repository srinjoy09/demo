package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studService {

    @Autowired
    public studRepo studRepo;

    public void addStud(Student student){
        int s=0;
        if(student.getEr().equals("completed"))
            s=s+50;
        if(student.getUserstory_1().equals("completed"))
            s=s+100;
        if(student.getUserstory_1().equals("pending"))
            s=s+50;
        if(student.getUserstory_2().equals("completed"))
            s=s+150;
        if(student.getUserstory_2().equals("pending"))
            s=s+75;
        if(student.getUserstory_3().equals("completed"))
            s=s+200;
        if(student.getUserstory_3().equals("pending"))
            s=s+100;

        student.setScore(s);
        //System.out.println(s);
        studRepo.save(student);
    }
}
