package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.model.Book;
import com.biblioteca.biblioteca.services.BookService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping("/todos")
    public ResponseEntity<List<Book>> todos(){
        List<Book> libros = service.ListaLibros();
        return new ResponseEntity<>(libros, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> buscarPorId(@PathVariable("id") Integer id) {
        Optional<Book> libro = service.BuscaId(id);
        return libro.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Book> insertar(@RequestBody Book data){
        Book insertar = service.Guardar(data);
        return new ResponseEntity<>(insertar, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarLibro(@PathVariable Integer id) {
        try{
            service.Borrar(id);
            return ResponseEntity.noContent().build();
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
}
