package com.nice.rookie.controller;

import com.nice.rookie.entity.Student;
import com.nice.rookie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students",method = RequestMethod.GET)
//    @GetMapping(value = "/students")
    public List<Student> findStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
//    @GetMapping(value = "/students/{id}")
    public Student findStudentById(@PathVariable Integer id){
        Student student = studentService.findById(id);
        if(student == null) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Student not found with id : " + id);
        }
        return student;
    }

}