package com.studentperformancemonitoring.app.student;

// Importing dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    // Dependency for interacting with the database.
    private final StudentRepository studentRepository;

    // Constructor for injecting the Student Repository into the Student service class.
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Function to retrieve a list of all students from the database.
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // Function to add a new student record to the database.
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    // Function to delete a student record from the database based on student/record ID.
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}


