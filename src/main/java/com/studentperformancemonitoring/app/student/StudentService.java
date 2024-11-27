package com.studentperformancemonitoring.app.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Kyle",
                        95,
                        35

                )
        );
    }

}


