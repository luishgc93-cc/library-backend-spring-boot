📚 Proyecto Spring Boot - API de Cursos y Alumnos

Este proyecto implementa dos APIs REST con Spring Boot para gestionar cursos y alumnos.

Desarrollado en Java 21.

🚀 Requisitos

Java 21

Maven o Gradle

Spring Boot (versión recomendada: 3.x)

📦 Estructura de la API

✏️ API de Cursos

Base path: /api/course

Método	Endpoint	Descripción

POST	/create	Crear un nuevo curso

GET	/all	Obtener todos los cursos

GET	/search/{id}	Buscar curso por ID

GET	/search-student/{idCourse}	Obtener alumnos inscritos en un curso (por ID de curso)

🎓 API de Alumnos

Base path: /api/student

Método	Endpoint	Descripción

POST	/create	Crear un nuevo alumno

GET	/all	Obtener todos los alumnos

GET	/search/{id}	Buscar alumno por ID

GET	/search-by-course/{idCourse}	Obtener alumnos inscritos en un curso (por ID)

⚠️ El endpoint /create devuelve el código HTTP 201 Created.

🛠️ Tecnologías utilizadas

Spring Boot

Spring Web

Java 21

▶️ Cómo ejecutar el proyecto

./mvnw clean install 

en cada proyecto

./mvnw spring-boot:run 

primero el config, gateway y luego los microservicios de cursos y alumnos

