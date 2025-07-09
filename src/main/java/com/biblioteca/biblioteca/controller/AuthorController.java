package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.dto.AuthorDTO;
import com.biblioteca.biblioteca.model.Author;
import com.biblioteca.biblioteca.services.AuthorService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AuthorController {
    @Autowired
    private AuthorService service;

    @GetMapping("/todos")
    public ResponseEntity<List<AuthorDTO>> todos() {
        List<AuthorDTO> autores = service.ListaAutor();
        return new ResponseEntity<>(autores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> buscarPorId(@PathVariable("id") Integer id) {
        Optional<Author> autor = service.BuscaId(id);
        return autor.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Author> insertar(@RequestBody Author data){
        Author insertar = service.Guardar(data);
        return new ResponseEntity<>(insertar, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> actualizarAutor(@PathVariable Integer id, @RequestBody Author data){
        Optional<Author> autorExiste = service.BuscaId(id);
        if (autorExiste.isPresent()) {
            Author actualizado = autorExiste.get();
            actualizado.setApellido(data.getApellido());
            actualizado.setNombre(data.getNombre());
            actualizado.setTelefono(data.getTelefono());
            return new ResponseEntity<>(service.Actualizar(id,actualizado), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarAutor(@PathVariable Integer id) {
        try{
            service.Borrar(id);
            return ResponseEntity.noContent().build();
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
}
