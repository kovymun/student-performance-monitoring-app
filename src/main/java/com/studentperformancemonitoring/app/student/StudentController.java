package com.studentperformancemonitoring.app.student;

// Importing dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // annotation to mark class as a REST controller to handle HTTP requests/responses
@RequestMapping(path = "api") // Base URL mapping for the controller functions
public class StudentController {

    private final StudentService studentService;

    // Constructor for injecting the service layer into the Student controller class
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Controller function that handles GET requests to retrieve a list of students and their performance results.
    @GetMapping(path = "/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // Controller function that handles POST requests to add a new student to the DB.
    @PostMapping(path = "/new-student")
    public void createStudent(@RequestBody Student student) {

        // Calling the service layer to add the student
        studentService.addStudent(student);
    }

    // Controller function that handles deletion of student from the DB.
    @DeleteMapping(path = "/remove-student/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long StudentId) {
        studentService.deleteStudent(StudentId);
    }
}
