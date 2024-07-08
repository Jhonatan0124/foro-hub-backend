# ForoHub Backend

ForoHub Backend es la parte servidor de una aplicación de foro en línea construida con Java, Spring Boot y MySQL. Este proyecto incluye todas las funcionalidades necesarias para manejar usuarios, publicaciones, comentarios y más. Utiliza una arquitectura robusta y moderna para garantizar un rendimiento eficiente y una fácil escalabilidad.

## Tecnologías utilizadas
- **Java** (JDK 17+)
- **Spring Boot** (3+)
- **Maven** (4+)
- **MySQL** (8+)

## Dependencias principales
- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security

## Requisitos de instalación
- Java JDK (versión 17+)
- Maven (versión 4+)
- Spring Boot (versión 3+)
- MySQL (versión 8+)
- IntelliJ IDEA (opcional)

## Configuración inicial
1. Clona este repositorio:
    ```bash
    git clone https://github.com/tu-usuario/foro-hub-backend.git
    ```

2. Configura tu entorno de desarrollo con las versiones requeridas.

3. Usa Spring Initializr para crear el proyecto con las dependencias necesarias. Puedes hacerlo manualmente o con este enlace preconfigurado:
    ```plaintext
    https://start.spring.io/
    ```

4. Configura la conexión a la base de datos MySQL en el archivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
    spring.datasource.username=tu-usuario
    spring.datasource.password=tu-contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```

5. Ejecuta la aplicación:
    ```bash
    mvn spring-boot:run
    ```

## Migraciones de Base de Datos
Este proyecto utiliza Flyway para gestionar las migraciones de base de datos. Las migraciones se encuentran en el directorio `src/main/resources/db/migration`.

## Contribuciones
Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos para contribuir:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios necesarios y haz commits (`git commit -am 'Agrega nueva funcionalidad'`).
4. Envía los cambios a tu repositorio fork (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

### Enlaces útiles
- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Spring Boot](https://start.spring.io/)
- [MySQL](https://dev.mysql.com/downloads/installer/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

---

## Autor
- **Jhonatan López** 
