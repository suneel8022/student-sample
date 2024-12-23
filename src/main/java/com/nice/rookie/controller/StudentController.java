package com.nice.rookie.controller;

import com.nice.rookie.entity.Student;
import com.nice.rookie.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

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


//    @RequestMapping(value = "/students", method = RequestMethod.POST)
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }

//    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Integer id){
//        System.out.println();
        return studentService.deleteStudent(id) != null ? "Student deleted successfully!!" : "No id exist";
    }


    @RequestMapping(value = "/students", method = RequestMethod.PUT)
    public String updateStudent(@RequestBody Student student){
        Student updatedStudent =  studentService.updateStudent(student);

        if(updatedStudent == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Unable to find student with id" + student.getStudentId() +"to update!!");
        }
        return "Student updated successfully " + updatedStudent;
    }


}
