package com.estudante.SistemaEstudante.controller;

import com.estudante.SistemaEstudante.model.StudentModel;
import com.estudante.SistemaEstudante.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/getByRegistry/{registry}")
    public StudentModel searchById(@PathVariable String registry){
        return studentService.getByRegistry(registry);
    }

    @PostMapping
    public StudentModel addStudent(@RequestBody StudentModel studentModel){
        return studentService.addStudent(studentModel);
    }
}
