package com.example.firebase_crud;

public class DataModel {

    String rollNumber;
    String studentName;
    String courseName;

    DataModel(){
        
    }

    public DataModel(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
