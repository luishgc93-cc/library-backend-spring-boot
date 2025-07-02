package com.example.spring.luis.springboot_app.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.spring.luis.springboot_app.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detallesInfo")   
    public String Info(Map<String, Object> model){
        model.put("title", "Servidor en linea");
        model.put("descripction", "descripcioooon");

        return "detallesInfo";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){
      return Arrays.asList(
        new Empleados("luis", "programar", "ave", "pro", 32,5,1)
      );
    
    }
}
