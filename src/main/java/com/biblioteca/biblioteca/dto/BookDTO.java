package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.model.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class BookDTO {

    private Integer Id;
    private String nombre, editorial, genero;
    private BigDecimal precio;
    private LocalDate fechaedicion;
    private AuthorDTO authorDTO;

    public BookDTO(Book pBook) {
        Id = pBook.getId();
        this.nombre = pBook.getNombre();
        this.editorial = pBook.getEditorial();
        this.genero = pBook.getGenero();
        this.precio = pBook.getPrecio();
        this.fechaedicion = pBook.getFechaedicion();
        authorDTO = new AuthorDTO(pBook.getAuthor());
    }
}
