package com.biblioteca.biblioteca.dto;

import com.biblioteca.biblioteca.model.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO {
    private Integer Id;

    private String nombre, apellido;

    public AuthorDTO(Author pAuthor) {
        this.Id = pAuthor.getId();
        this.nombre = pAuthor.getNombre();
        this.apellido = pAuthor.getApellido();
    }

}
