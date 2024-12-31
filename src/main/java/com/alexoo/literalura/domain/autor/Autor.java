package com.alexoo.literalura.domain.autor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Autor")
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Asegura que el nombre no pueda ser nulo en la base de datos
    private String nombre;

    private String fechaNacimiento;

    private String fechaDefuncion;

    public Autor() {
    }

    public Autor(Long id, String nombre, String fechaNacimiento, String fechaDefuncion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
    }

    public Autor(AutorDTO autorDTO) {
        this.nombre = autorDTO.nombre();
        this.fechaNacimiento = autorDTO.fechaNacimiento();
        this.fechaDefuncion = autorDTO.fechaDefuncion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(String fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }
}
