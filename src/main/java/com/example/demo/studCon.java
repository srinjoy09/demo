package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class studCon {
    @Autowired
    private studService studService;

    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        studService.addStud(student);
        return new ResponseEntity<>("Student added", HttpStatus.OK);
    }
}
