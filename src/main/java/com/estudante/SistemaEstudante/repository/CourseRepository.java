package com.estudante.SistemaEstudante.repository;
import com.estudante.SistemaEstudante.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel, Long> {

}
