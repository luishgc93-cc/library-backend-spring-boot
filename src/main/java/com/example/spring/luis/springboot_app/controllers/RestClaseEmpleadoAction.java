package com.example.spring.luis.springboot_app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.luis.springboot_app.models.Empleados;

@RestController
@RequestMapping("/api")
public class RestClaseEmpleadoAction {

    @RequestMapping(path = "/empleadoClase", method=RequestMethod.GET)
    public Map<String, Object> empleadoClase() {
       Empleados empleado1 = new Empleados(
            "luis", 
            "gonza", 
            "avenida hispanidad", 
            "programador",
            32,
            622235,
            2);
        
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("api", empleado1);
        return respuesta;
    }
}