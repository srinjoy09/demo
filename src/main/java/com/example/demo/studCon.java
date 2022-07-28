package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Controller
public class studCon {
    @Autowired
    private studService studService;

    @Autowired
    private teamRepo teamRepo;

    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody List<Student> students){
        for(Student student: students)
            studService.addStud(student);
        return new ResponseEntity<>("Students added", HttpStatus.OK);
    }
    @DeleteMapping("/delStudent/{id}")
    public ResponseEntity<?> delStudent(@PathVariable String id){
        studService.deleteStudent(id);
        return new ResponseEntity<>("Student deleted", HttpStatus.OK);
    }
    @PostMapping("/updateStudent")
    public ResponseEntity<?> updateStudent(@RequestBody Student student){
        studService.updateStud(student);
        return new ResponseEntity<>("Student updated", HttpStatus.OK);
    }
    @GetMapping("/getScore")
    @ResponseBody
    public ResponseEntity<?> getScore() throws IOException {
        final File file = new File("score.txt");
        List<Team> scores=teamRepo.findAll();
        FileWriter writer = new FileWriter("output.txt");
        for(Team team: scores) {
            writer.write(team + System.lineSeparator());
        }
        writer.close();
        return new ResponseEntity<>(teamRepo.findAll(), HttpStatus.OK);
    }
}
