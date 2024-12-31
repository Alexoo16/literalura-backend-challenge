package com.alexoo.literalura.domain.autor;


public record AutorListarDTO(
        String nombre,
        String fechaNacimiento,
        String fechaDefuncion
) {
    public AutorListarDTO(Autor autor){
        this(autor.getNombre(), autor.getFechaNacimiento(), autor.getFechaDefuncion());
    }
    public String toString(){
        return """
                Nombre: %s
                Fecha de nacimiento: %s
                Fecha de defunción: %s
                """.formatted(nombre, fechaNacimiento, fechaDefuncion);
    }
}
