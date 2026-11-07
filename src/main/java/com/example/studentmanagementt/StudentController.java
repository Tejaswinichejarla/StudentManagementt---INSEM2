package com.example.studentmanagementt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Varun"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(103, "Kiran"));
        students.add(new Student(104, "Arjun"));

        return students;
    }
}