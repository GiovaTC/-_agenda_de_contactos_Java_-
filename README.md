# -_agenda_de_contactos_Java_- :.
# 📒 Agenda de Contactos:

<img width="1254" height="1254" alt="image" src="https://github.com/user-attachments/assets/b8332553-e99c-4d83-bf5c-7fb328a22e34" />  

```
Proyecto muy básico desarrollado en **Java 21 + IntelliJ IDEA + Consola + MySQL 8 + JDBC**, ideal
para practicar la conexión a una base de datos y realizar operaciones CRUD básicas .

---

# Objetivo

Desarrollar una aplicación de consola que permita:

* Conectarse a una base de datos MySQL.
* Registrar un contacto.
* Mostrar todos los contactos almacenados.
* Cerrar correctamente la conexión con la base de datos.

---

# Tecnologías

* Java 21
* IntelliJ IDEA
* MySQL 8
* JDBC
* Aplicación de Consola

---

# Estructura del Proyecto

```text
AgendaContactos/
│
├── src/
│
├── config/
│   └── ConexionBD.java
│
├── modelo/
│   └── Contacto.java
│
├── dao/
│   └── ContactoDAO.java
│
└── Main.java
```

---

# Base de Datos

## Crear Base de Datos

```sql
CREATE DATABASE agenda_db;
```

## Seleccionar Base de Datos

```sql
USE agenda_db;
```

## Crear Tabla

```sql
CREATE TABLE contactos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    telefono VARCHAR(30),
    correo VARCHAR(100)
);
```

---

# Menú del Programa

```text
=========================
AGENDA DE CONTACTOS
=========================

1. Agregar contacto
2. Listar contactos
3. Salir

Opción:
```

---

# Funcionamiento

## Opción 1 – Agregar Contacto

Solicita al usuario:

```text
Nombre:
Teléfono:
Correo:
```

Después guarda la información en MySQL.

---

## Opción 2 – Listar Contactos

Muestra todos los registros almacenados.

Ejemplo:

```text
ID   Nombre      Teléfono      Correo

1    Juan        3001234567    juan@gmail.com
2    María       3109876543    maria@gmail.com
```

---

## Opción 3 – Salir

Finaliza la ejecución del programa y cierra correctamente la conexión con la base de datos.

---

# Clases del Proyecto

## ConexionBD.java

### Responsabilidades

* Abrir la conexión con MySQL.
* Cerrar la conexión correctamente.

---

## Contacto.java

Modelo de datos de un contacto.

### Atributos

* id
* nombre
* telefono
* correo

---

## ContactoDAO.java

Clase encargada del acceso a datos.

### Métodos

* `guardar()`
* `listar()`

---

## Main.java

Clase principal de la aplicación.

### Responsabilidades

* Mostrar el menú.
* Leer la información ingresada por el usuario.
* Invocar los métodos del DAO.
* Finalizar correctamente el programa.

---

# Consultas SQL Utilizadas

## Insertar Contacto

```sql
INSERT INTO contactos(nombre, telefono, correo)
VALUES (?, ?, ?);
```

---

## Consultar Contactos

```sql
SELECT * FROM contactos;
```

---

# Resultado Esperado

```text
=========================
AGENDA DE CONTACTOS
=========================

1. Agregar contacto
2. Listar contactos
3. Salir

Opción: 1

Nombre: Carlos
Teléfono: 3201112233
Correo: carlos@gmail.com

Contacto guardado correctamente.
```

Posteriormente:

```text
Opción: 2

ID   Nombre      Teléfono      Correo

1    Carlos      3201112233    carlos@gmail.com
```

---

# Archivos del Proyecto

* ConexionBD.java
* Contacto.java
* ContactoDAO.java
* Main.java

---

# Tamaño del Proyecto

Este proyecto contiene aproximadamente **180 a 220 líneas de código**, por lo que resulta ideal para comenzar a practicar:

* Conexión mediante JDBC.
* Uso de MySQL.
* Programación orientada a objetos.
* Aplicaciones de consola.
* Organización en paquetes.
* Patrón DAO (Data Access Object).

---

# Mejoras Propuestas

Una vez completado el proyecto, se pueden incorporar nuevas funcionalidades como:

* Actualizar contactos.
* Eliminar contactos.
* Buscar contactos por nombre.
* Validación de datos.
* Menú con más opciones.
* Exportar información a:

  * TXT
  * CSV
  * XML

---

# Objetivos de Aprendizaje

Al finalizar este proyecto serás capaz de:

* Crear una aplicación Java de consola.
* Conectar Java con MySQL mediante JDBC.
* Ejecutar instrucciones `INSERT`.
* Ejecutar consultas `SELECT`.
* Recorrer un `ResultSet`.
* Utilizar clases modelo (POJO).
* Implementar un DAO para acceder a la base de datos.
* Organizar un proyecto Java utilizando paquetes.
* Preparar la base para implementar un CRUD completo.

---

# Licencia

Proyecto educativo desarrollado con fines de aprendizaje y práctica de **Java 21**, **JDBC** y **MySQL 8**.
:. . / .
