package com.nice.rookie.dao;

import com.nice.rookie.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudents();

    Student findById(Integer id);

    Student addStudent(Student student);

    Integer removeStudent(Integer id);

    Student updateStudent(Student student);
}
