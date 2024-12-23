package com.nice.rookie.dao;

import com.nice.rookie.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

        static Student student1 = new Student(1,"Mark","Spring","New York");
        static Student student2= new Student(2,"Steve","React","Chennai");
        static Student student3 = new Student(3,"Bruce","Node.js","Bangalore");

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

        public Integer removeStudent(Integer id){
        for(Student student : studentList){
            if(student.getStudentId().equals(id)){
                studentList.remove(student);
                return id;
            }
        }
        return null;
        }

        public Student updateStudent(Student student){
        Integer id = student.getStudentId();
            for(Student tempSt : studentList){
                if(tempSt.getStudentId().equals(id)){
                    tempSt.setStudentName(student.getStudentName());
                    tempSt.setCourse(student.getCourse());
                    tempSt.setCity(student.getCity());
                        return tempSt;
                }
            }

            return null;

        }




}
