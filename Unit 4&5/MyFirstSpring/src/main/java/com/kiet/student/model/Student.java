package com.kiet.student.model;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private String branch;
    private int year;
    private double cgpa;

    public Student() {
    }

    public Student(int studentId, String name, String email,
                   String branch, int year, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.year = year;
        this.cgpa = cgpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

