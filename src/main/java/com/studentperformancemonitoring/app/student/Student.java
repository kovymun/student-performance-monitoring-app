package com.studentperformancemonitoring.app.student;

public class Student {
    private Long id;
    private String name;
    private Integer engGrade;
    private Integer mathGrade;

    public Student() {
    } //no arg constructor

    public Student(Long id, String name, Integer engGrade, Integer mathGrade) {
        this.id = id;
        this.name = name;
        this.engGrade = engGrade;
        this.mathGrade = mathGrade;
    }

    public Student(String name, Integer engGrade, Integer mathGrade) {
        this.name = name;
        this.engGrade = engGrade;
        this.mathGrade = mathGrade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEngGrade() {
        return engGrade;
    }

    public void setEngGrade(Integer engGrade) {
        this.engGrade = engGrade;
    }

    public Integer getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(Integer mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engGrade=" + engGrade +
                ", mathGrade=" + mathGrade +
                '}';
    }
}
