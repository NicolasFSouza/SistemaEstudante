package com.estudante.SistemaEstudante.service;
import com.estudante.SistemaEstudante.model.StudentModel;
import com.estudante.SistemaEstudante.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentModel getByRegistry(String resgistry){
        return studentRepository.getByRegistry(resgistry)
                .orElseThrow(() -> new RuntimeException("aluno não encontrado pelo nome: " + resgistry));
    }

    public StudentModel addStudent(StudentModel studentModel){
        return studentRepository.save(studentModel);
    }
}
