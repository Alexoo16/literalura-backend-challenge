# Literalura

Literalura es una aplicación Java para la gestión de libros y autores. Permite a los usuarios buscar libros por título, registrar nuevos libros, listar autores y libros registrados, y realizar búsquedas filtradas como autores vivos en un año determinado o libros por idioma. La aplicación consume datos de una API externa (Gutendex) para realizar búsquedas de libros.

## Funcionalidades

La aplicación cuenta con un menú interactivo que permite a los usuarios realizar las siguientes acciones:

1. **Buscar libro por título**: Permite buscar libros por título utilizando la API de Gutendex y registrar el libro si se desea.
2. **Listar libros registrados**: Muestra una lista de todos los libros que han sido registrados en el sistema.
3. **Listar autores registrados**: Muestra una lista de todos los autores registrados en el sistema.
4. **Listar autores vivos en un determinado año**: Permite ingresar un año y obtener los autores que estaban vivos en ese año.
5. **Listar libros por idioma**: Muestra todos los libros registrados en el sistema de un idioma específico.
6. **Top libros más descargados**: Muestra los libros más descargados del sistema, según el número de descargas.

## Requisitos

Para ejecutar esta aplicación, necesitas tener lo siguiente:

- **JDK 17 o superior**: La aplicación está desarrollada en Java.
- **Base de datos PostgreSQL**: Utiliza PostgreSQL para almacenar los datos de libros y autores. Asegúrate de tener una base de datos configurada con las credenciales adecuadas.
- **Dependencias de Maven**: Asegúrate de tener Maven instalado para manejar las dependencias.

## Configuración

1. **Clonar el repositorio**

   Para comenzar, clona el repositorio a tu máquina local:

   ```bash
     git clone https://github.com/Alexoo16/literalura-backend-challenge.git
     cd literalura-backend-challenge
   ```
2. **Configurar la base de datos**

   Debes crear una base de datos en PostgreSQL para almacenar los datos de la aplicación. Luego, configura las credenciales de la base de datos en el archivo *application.properties*:

  ```properties
    spring.application.name=literalura
    spring.datasource.url=jdbc:postgresql://${DB_Host}/${DB_Name}
    spring.datasource.username=${DB_User}
    spring.datasource.password=${DB_Password}
    spring.datasource.driver-class-name=org.postgresql.Driver
    hibernate.dialect=org.hibernate.dialect.HSQLDialect
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql = true
    spring.jpa.format-sql = true
   ```
  Sustituye *${DB_Host}*, *${DB_Name}*, *${DB_User}*, y *${DB_Password}* por los valores correspondientes de tu entorno de base de datos.
## Dependencias
  **Spring Boot Starter Data JPA**: Proporciona soporte para el uso de JPA (Java Persistence API) en Spring Boot.
  
  **PostgreSQL Driver**: Controlador JDBC para conectar con bases de datos PostgreSQL.
  
  **Spring Boot Starter Test**: Dependencia para pruebas unitarias y de integración con Spring Boot.
  
  **Jackson Databind**: Librería para trabajar con JSON en Java, utilizada para la serialización y deserialización de objetos.
  
## Sobre el Desarrollador
Mi nombre es Alexander Jesús Centeno Cerna y soy estudiante de Ingeniería de Sistemas en la Universidad Nacional Mayor de San Marcos (UNMSM). Tengo una gran pasión por la tecnología, especialmente en el desarrollo de software, análisis de datos y gestión de procesos. Me interesa trabajar con herramientas modernas y aprender constantemente para poder afrontar desafíos en el ámbito profesional, contribuyendo al crecimiento de proyectos innovadores como este.

<img src="https://github.com/user-attachments/assets/05880886-01b3-49ec-bad3-5553be56523d" alt="Imagen del Desarrollador" style="width: 450px; height: auto;">
  
