package com.alexoo.literalura.domain.autor;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignorar campos desconocidos
public record AutorDTO(
        @JsonAlias("name")
        String nombre,
        @JsonAlias("birth_year")
        String fechaNacimiento,
        @JsonAlias("death_year")
        String fechaDefuncion
) {
}
