package com.example.spring.luis.springboot_app.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring.luis.springboot_app.models.dto.DTO;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class RestActionController {

    @RequestMapping(path = "/dto", method=RequestMethod.GET)
    public DTO api(){
        
        DTO usuario1 = new DTO();
        usuario1.setTitulo("titulooo" );
        usuario1.setUsuario("usuario luis" );
        return usuario1;
    }
}
