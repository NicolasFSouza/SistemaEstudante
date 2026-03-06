package com.estudante.SistemaEstudante.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
    @Id
    @Column(nullable = false, unique = true, length = 10)
    private String registry;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String studentSem;

}
