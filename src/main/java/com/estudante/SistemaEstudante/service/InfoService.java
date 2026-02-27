package com.estudante.SistemaEstudante.service;

import com.estudante.SistemaEstudante.model.InfoModel;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
        @Value("${spring.application.name:sem nome}")
        private String applicationName;
        private LocalDateTime time = LocalDateTime.now();
        private String javaVersion = System.getProperty("java.version");
        private String status = "Status: UP";

    public InfoModel getInfo(){
        InfoModel infomodel = new InfoModel(applicationName, time, javaVersion, status);
        return infomodel;
    }
}
