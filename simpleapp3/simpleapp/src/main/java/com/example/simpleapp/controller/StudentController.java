package com.example.simpleapp.controller;

import com.example.simpleapp.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"David","Goggins"));
        list.add(new Student(2,"Andrew","Huberman"));
        list.add(new Student(3,"Elon","Musk"));

        return list;
    }

}