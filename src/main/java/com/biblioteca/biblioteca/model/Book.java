package com.biblioteca.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nombre, editorial, genero, titulo;
    private BigDecimal precio;
    private LocalDate fechaedicion;
    @ManyToOne
    @JsonBackReference
    private Author author;
}
