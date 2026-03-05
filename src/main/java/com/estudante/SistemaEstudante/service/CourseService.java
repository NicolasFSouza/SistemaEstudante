package com.estudante.SistemaEstudante.service;
import com.estudante.SistemaEstudante.model.CourseModel;
import com.estudante.SistemaEstudante.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<CourseModel> getAll(){return courseRepository.findAll();}

}
