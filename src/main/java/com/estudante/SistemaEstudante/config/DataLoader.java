package com.estudante.SistemaEstudante.config;
import com.estudante.SistemaEstudante.model.CourseModel;
import com.estudante.SistemaEstudante.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner{

    private final CourseRepository courseRepository;

    @Override
    public void run(String ... args){
        if (courseRepository.count() == 0){
            courseRepository.save(new CourseModel(1L, "engenharia de sofware"));
            courseRepository.save(new CourseModel(2L, "ADS"));
            courseRepository.save(new CourseModel(3L, "CeT"));
        }
    }
}
