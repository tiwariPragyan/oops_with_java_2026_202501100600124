package com.kiet.student.controller;

import com.kiet.student.model.Student;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    // GET: Retrieve all students
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    // POST: Add a new student
    @PostMapping
public String addStudent(@RequestBody Student student) {
    boolean exists = students.stream()
            .anyMatch(s ->
                    s.getStudentId() == student.getStudentId());

    if (exists) {
        return "Student ID already exists";
    }

    students.add(student);
    return "Student added successfully";
}

    // GET: Retrieve student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()
                .filter(s -> s.getStudentId() == id)
                .findFirst()
                .orElse(null);
    }

    // PUT: Update student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestBody Student updatedStudent) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                s.setName(updatedStudent.getName());
                s.setEmail(updatedStudent.getEmail());
                s.setBranch(updatedStudent.getBranch());
                s.setYear(updatedStudent.getYear());
                s.setCgpa(updatedStudent.getCgpa());
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }

    // DELETE: Remove student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean removed = students.removeIf(
                s -> s.getStudentId() == id
        );
        return removed ? "Student deleted successfully"
                       : "Student not found";
    }

    // Search by branch and/or year
    @GetMapping("/search")
    public List<Student> searchStudents(
            @RequestParam(required = false) String branch,
            @RequestParam(required = false) Integer year) {

        return students.stream()
                .filter(s -> branch == null ||
                        s.getBranch().equalsIgnoreCase(branch))
                .filter(s -> year == null || s.getYear() == year)
                .toList();
    }

    // Search by minimum CGPA
    @GetMapping("/cgpa")
    public List<Student> getStudentsByCgpa(
            @RequestParam double minCgpa) {

        return students.stream()
                .filter(s -> s.getCgpa() >= minCgpa)
                .toList();
    }
}
