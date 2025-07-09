package com.biblioteca.biblioteca.services;

import com.biblioteca.biblioteca.model.Book;
import com.biblioteca.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository repositorio;

    public List<Book> ListaLibros(){
        return repositorio.findAll();
    }

    public Optional<Book> BuscaId(int Id){
        return repositorio.findById(Id);
    }

    public Book Guardar(Book libro){
        return repositorio.save(libro);
    }

    public void Borrar(int Id){
        repositorio.deleteById(Id);
    }
}
