📚 Spring Boot REST API: Autores y Libros
Este proyecto es una aplicación RESTful desarrollada con Spring Boot, que permite gestionar información de autores y libros.

✨ Características principales
CRUD básico de autores.

CRUD básico de libros.

API estructurada bajo /api/autores y /api/libros.

Uso de ResponseEntity para respuestas HTTP.

📦 Endpoints
🔹 Autores (/api/autores)
Método	Endpoint	Descripción
GET	/todos	Listar todos los autores.
GET	/{id}	Obtener autor por ID.
POST	/	Insertar un nuevo autor.
PUT	/{id}	Actualizar autor por ID.
DELETE	/{id}	Eliminar autor por ID.

🔹 Libros (/api/libros)
Método	Endpoint	Descripción
GET	/todos	Listar todos los libros.
GET	/{id}	Obtener libro por ID.
POST	/	Insertar un nuevo libro.
DELETE	/{id}	Eliminar libro por ID.

🚀 Cómo ejecutar la aplicación
Clona el repositorio:

bash
Copiar
Editar
git clone https://github.com/tu-usuario/tu-repositorio.git
Accede a la carpeta del proyecto:

bash
Copiar
Editar
cd tu-repositorio
Ejecuta el proyecto:

bash
Copiar
Editar
./mvnw spring-boot:run
o

bash
Copiar
Editar
mvn spring-boot:run
La aplicación quedará disponible por defecto en:
👉 http://localhost:8080
