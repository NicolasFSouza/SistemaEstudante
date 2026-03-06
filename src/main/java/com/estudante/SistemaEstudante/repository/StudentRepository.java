package com.estudante.SistemaEstudante.repository;
import com.estudante.SistemaEstudante.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, String> {
    Optional<StudentModel> getByRegistry(String registry);
}
