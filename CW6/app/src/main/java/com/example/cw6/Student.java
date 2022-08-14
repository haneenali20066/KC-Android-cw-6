package com.example.cw6;

public class Student {
    private String studentname;
    private int studentage ;
    private int studentimage;
    private int studentgrade;





    public Student(String studentname, int studentage, int studentimage ,int studentgrade) {
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentimage = studentimage;
        this.studentgrade = studentgrade;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentimage() {
        return studentimage;
    }

    public void setStudentimage(int studentimage) {
        this.studentimage = studentimage;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }
}
