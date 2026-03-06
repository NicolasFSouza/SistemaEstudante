package com.estudante.SistemaEstudante.config;
import com.estudante.SistemaEstudante.model.CourseModel;
import com.estudante.SistemaEstudante.repository.CourseRepository;
import com.estudante.SistemaEstudante.model.StudentModel;
import com.estudante.SistemaEstudante.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import  org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner{
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;
    @Override
    public void run(String ... args){
        if (courseRepository.count() == 0){
        courseRepository.save(new CourseModel(null, "eng de software"));
        courseRepository.save(new CourseModel(null, "ADS"));
        courseRepository.save(new CourseModel(null, "CeT"));
        courseRepository.save(new CourseModel(null, "ADM"));
        courseRepository.save(new CourseModel(null, "IA"));

        studentRepository.save(new StudentModel("20246669", "nicolas", "2" ));
        studentRepository.save(new StudentModel("20241341", "pedro", "3" ));
        studentRepository.save(new StudentModel("202499929", "Jão", "5" ));
        }
    }
}
