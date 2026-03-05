package com.estudante.SistemaEstudante.controller;
import com.estudante.SistemaEstudante.model.CourseModel;
import com.estudante.SistemaEstudante.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    public String listAll(Model model){
        model.addAttribute("value", courseService.getAll().toString());
        return "courses/listAll";
    }
}