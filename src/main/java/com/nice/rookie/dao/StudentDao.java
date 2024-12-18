package com.nice.rookie.dao;

import com.nice.rookie.entity.Student;
import org.apache.tomcat.util.json.JSONFilter;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentDao {

        static Student student1 = new Student(1,"Mark","Spring","New York");
        static Student student2= new Student(2,"Steve","React","Chennai");
        static Student student3 = new Student(3,"Bruce","Node.js","Banglore");

        static List<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2,student3));

    public List<Student>findAllStudents(){
        return studentList;

    }


        public Student findById(Integer id){
            List<Student> studentList = findAllStudents();
            for(Student student : studentList){
                if(student.getStudentId().equals(id)){
                    return student;
                }
            }
            return null;
        }



        public Student addStudent(Student student){
            List<Student> stuList = findAllStudents();
            stuList.add(student);
            return student;
        }





}
