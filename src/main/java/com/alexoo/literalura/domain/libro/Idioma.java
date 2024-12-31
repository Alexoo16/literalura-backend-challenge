package com.alexoo.literalura.domain.libro;

import java.util.HashMap;
import java.util.Map;

public enum Idioma {
    ESPANOL("es"),
    INGLES("en"),
    FRANCES("fr"),
    ITALIANO("it"),
    ALEMAN("de"),
    PORTUGUES("pt"),
    RUSO("ru"),
    CHINO("zh"),
    JAPONES("ja");

    private final String codigo;

    // Mapa para realizar la conversión desde el código al enum
    private static final Map<String, Idioma> CODIGO_A_IDIOMA = new HashMap<>();

    // Bloque estático para inicializar el mapa
    static {
        for (Idioma idioma : values()) {
            CODIGO_A_IDIOMA.put(idioma.codigo, idioma);
        }
    }

    // Constructor
    Idioma(String codigo) {
        this.codigo = codigo;
    }

    // Método para obtener el enum a partir del código
    public static Idioma desdeCodigo(String codigo) {
        return CODIGO_A_IDIOMA.getOrDefault(codigo, null); // Devuelve null si el código no es válido
    }

    // Método para obtener el código del idioma
    public String getCodigo() {
        return codigo;
    }
}
