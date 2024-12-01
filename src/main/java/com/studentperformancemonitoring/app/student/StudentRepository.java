/* Repository interface for managing database operations using Spring Data JPA */

package com.studentperformancemonitoring.app.student;

// Importing dependencies
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // @Repository annotation is used to indicate that the class/interface is a Spring managed component that interacts with the database.
public interface StudentRepository extends JpaRepository<Student, Long> {
}
