# Kata1

### 👥 Autor
[Enrique Sosa Ojeda](https://github.com/Enric1005)

## 1. Objetivo de la entrega

Proyecto Java para practicar el flujo básico de trabajo con IntelliJ IDEA y familiarizarse con Git mediante la creación de varias ramas, la realización de varios commits y el envío de los cambios (push) a un repositorio remoto.

La clase de dominio es `Person`, que contiene los atributos `name` y `birthday`. Como valor derivado, incluye un método que calcula la edad.

## 2. Cómo compilar y ejecutar

**Desde IntelliJ IDEA:** abrir la carpeta del proyecto y ejecutar `Main` con el botón ▶ junto al método `main`.

## 3. Dependencias y versión de JDK

- JDK: Oracle OpenJDK 27
- Gestor de dependencias: Maven

## 4. Estructura de la entrega y clases principales

```
kata1/
├── src/main/java/software/ulpgc/
│   ├── Person.java
│   └── Main.java
├── pom.xml
├── .gitignore
└── README.md
```

- **`Person`**: `record` inmutable con los atributos `name` y `birthday` y el método `age`, que calcula la edad.
- **`Main`**: crea una `Person`, invoca el método `age` y muestra el resultado por consola.

Paquete base: `software.ulpgc.katas`.

## 5. Flujo Git usado

- **Ramas:** `master` y `develop`.
- **Proceso:** el trabajo y los commits se realizaron en `develop`. Al final se integró en `master` mediante un merge y se hizo push de ambas ramas a GitHub.

## 6. Vídeo explicativo (máximo 7 minutos)

▶️ [Ver vídeo](https://www.youtube.com/watch?v=sG9J4tGLPQI)
