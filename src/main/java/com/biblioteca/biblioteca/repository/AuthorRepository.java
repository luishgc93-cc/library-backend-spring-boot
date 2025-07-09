package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
