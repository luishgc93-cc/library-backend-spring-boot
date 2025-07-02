package com.example.spring.luis.springboot_app.controllers;

import org.springframework.web.bind.annotation.*;
import com.example.spring.luis.springboot_app.models.dto.ParamDTO;

@RestController
@RequestMapping("/api")
public class ParamController {
    
    @GetMapping("/param")
    public ParamDTO param(@RequestParam String informacion) {
        ParamDTO parametro1 = new ParamDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }
}
