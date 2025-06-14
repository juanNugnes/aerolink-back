# AeroLink Reservation System

Sistema de reservas para la empresa AeroLink, desarrollado con arquitectura de microservicios utilizando Spring Boot y tecnologías modernas para garantizar escalabilidad, seguridad y eficiencia.

## Tecnologías principales

- **Backend**
    - Java 17
    - Spring Boot 3.x
    - Spring Data JPA + Hibernate
    - Spring Security (JWT)
    - Lombok
    - MapStruct
    - PostgreSQL

## Requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL

## Ejecución local

1. **Clonar el proyecto**

```
git clone https://github.com/tuusuario/aerolink-reservation.git
cd aerolink-reservation
```

2. **Configurar base de datos**

Crear una base de datos PostgreSQL con el nombre aerolink_db y las credenciales adecuadas.

``` 
sql
CREATE DATABASE aerolink_db;
```
3. **Configurar application.yml o .properties**

```
yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/aerolink_db
    username: postgres
    password: tu_password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    database-platform: org.hibernate.dialect.PostgreSQLDialect 
```

4. **Compilar el proyecto**

```
bash
mvn clean install
Ejecutar la aplicación
```

5. *Ejecutar la aplicación*
```
bash
mvn spring-boot:run
```