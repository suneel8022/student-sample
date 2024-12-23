package com.nice.rookie.service;

import com.nice.rookie.dao.StudentDaoImpl;
import com.nice.rookie.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDaoImpl studentDao;


    public List<Student> getAllStudents(){
        return studentDao.findAllStudents();
    }

    public Student findById(Integer id){
        return studentDao.findById(id);
    }

    public Student addStudent(Student student){
        return studentDao.addStudent(student);
    }

    public Integer deleteStudent(Integer id){
        return studentDao.removeStudent(id);
    }

    public Student updateStudent(Student student){
        return studentDao.updateStudent(student);
    }
}
