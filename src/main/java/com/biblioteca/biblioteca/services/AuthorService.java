package com.biblioteca.biblioteca.services;

import com.biblioteca.biblioteca.dto.AuthorDTO;
import com.biblioteca.biblioteca.model.Author;
import com.biblioteca.biblioteca.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repositorio;

    public List<AuthorDTO> ListaAutor() {
        List<Author> autores = repositorio.findAll();
        return autores.stream()
                .map(AuthorDTO::new)
                .collect(Collectors.toList());
    }

    public Optional<Author> BuscaId(int Id){
        return repositorio.findById(Id);
    }

    public Author Actualizar(int Id, Author author){
        Author authorEncontrado = repositorio.findById(Id)
                .orElseThrow(()-> new RuntimeException("Autor no encontrado" + Id));
        return repositorio.save(authorEncontrado);
    }

    public Author Guardar(Author author){
        return repositorio.save(author);
    }

    public void Borrar(int Id){
        repositorio.deleteById(Id);
    }
}
