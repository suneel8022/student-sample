package com.nice.rookie.entity;

public class Student {
    private Integer studentId;

    private String studentName;

    private String course;

    private String city;

    public Student(Integer studentId, String studentName, String course, String city) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.city = city;
    }

    public Student(String studentName, String course, String city) {
        this.studentName = studentName;
        this.course = course;
        this.city = city;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
