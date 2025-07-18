# Backend - Product Manager

API REST en **Spring Boot** para gestionar productos con nombre, precio y stock.

## ✅ Funcionalidades

* Crear un producto
* Listar todos los productos
* Actualizar un producto
* Eliminar un producto
* Cargar productos de prueba (`/productos/seed`)

## 📦 Requisitos

* Java 17+
* Maven
* Docker (con PostgreSQL ya configurado)

## 🐳 Base de datos

La base de datos PostgreSQL se levanta con Docker usando el `docker-compose.yml` ya incluido. Solo ejecuta:

```bash
docker-compose up -d
```

> No utiliza volúmenes persistentes. Los datos se eliminan al bajar el contenedor.

## 🚀 Correr la aplicación

```bash
./mvnw spring-boot:run
```

Accede a:
`http://localhost:8080`

## 🛠 Endpoints disponibles

| Método | Ruta              | Descripción                  |
| ------ | ----------------- | ---------------------------- |
| GET    | `/productos`      | Lista todos los productos    |
| POST   | `/productos`      | Crea o actualiza un producto |
| POST   | `/productos/{id}` | Elimina un producto          |
| GET    | `/productos/seed` | Carga productos de prueba    |

## 🧪 Probar con Postman

Importa la colección desde:
`/postman/ProductosManager.postman_collection.json`

## 📁 Estructura del proyecto

```
src/main/java/com/samueljimenez/productsmanager/
├── controller/
├── model/
├── repository/
├── service/
└── ProductsManagerApplication.java
```

## Notas

* Se usó docker solamente para levantar la base de datos, al igual que crearla

---

Desarrollado por **Samuel Jiménez**.
