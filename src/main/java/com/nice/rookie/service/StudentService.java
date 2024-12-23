package com.nice.rookie.service;

import com.nice.rookie.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student findById(Integer id);

    Student addStudent(Student student);

    public Integer deleteStudent(Integer id);

    public Student updateStudent(Student student);
}
