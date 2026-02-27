package com.estudante.SistemaEstudante.controller;
import com.estudante.SistemaEstudante.model.InfoModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.estudante.SistemaEstudante.service.InfoService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/sistema")
public class InfoController {


    private  final InfoService info;

    public InfoController(InfoService info) {
        this.info = info;
    }


    @GetMapping("/info")
    public InfoModel info() {
        return info.getInfo();
    }

}
