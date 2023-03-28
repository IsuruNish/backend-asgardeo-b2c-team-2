package com.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    //DEPENDENCY INJECTION
    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData) {
        studentRepository.save(studentData);
    }

    @GetMapping("/student/")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
